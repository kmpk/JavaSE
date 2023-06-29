package inter.pkg;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalTime;

public class FileIpReader implements Runnable {
    private final IpBuffer buffer;
    private final Path file;
    private final long initPos;
    private final long toPos;
    private final int byteBuffer;
    private final IpParser parser = new IpParser();

    public FileIpReader(IpBuffer buffer, Path file, long initPos, long toPos, int byteBuffer) {
        this.buffer = buffer;
        this.file = file;
        this.initPos = initPos;
        this.toPos = toPos;
        this.byteBuffer = byteBuffer;
    }

    private void parseAllIps() throws IOException {
        System.out.println(LocalTime.now() + " " + Thread.currentThread().getName() + " " + initPos + " : " + toPos);
        try (SeekableByteChannel seekableByteChannel = Files.newByteChannel(file, StandardOpenOption.READ)) {
            seekableByteChannel.position(initPos);
            ByteBuffer bf = ByteBuffer.allocate(byteBuffer);
            findNextLineAndSetPosition(seekableByteChannel, bf);
            StringBuilder current = new StringBuilder();
            boolean first = true;
            while (seekableByteChannel.position() < seekableByteChannel.size() && seekableByteChannel.position() < toPos) {
                int bytes = seekableByteChannel.read(bf);
                if (bytes == 0) {
                    break;
                }
                bf.flip();
                while (bf.position() < bf.limit()) {
                    char c = (char) bf.get();
                    if (c == '\n') {
                        if (first) {
                            first = false;
                        }
                        buffer.accept(parser.parseIp(current));
                        current.setLength(0);
                    } else {
                        current.append(c);
                    }
                }
                bf.clear();
            }
            if (seekableByteChannel.position() == seekableByteChannel.size() && parser.isValidIp(current)) {
                buffer.accept(parser.parseIp(current));
            }
        } finally {
            buffer.flush();
            System.out.println(LocalTime.now() + " END " + Thread.currentThread().getName() + " " + initPos + " : " + toPos);
        }
    }

    private void findNextLineAndSetPosition(SeekableByteChannel seekableByteChannel, ByteBuffer bf) throws IOException {
        if (initPos != 0) {
            seekableByteChannel.read(bf);
            bf.flip();
            int c = 1;
            while (bf.position() < bf.limit()) {
                char c1 = (char) bf.get();
                if (c1 == '\n') break;
                c++;
            }
            seekableByteChannel.position(initPos + c);
            bf.clear();
        }
    }

    @Override
    public void run() {
        try {
            parseAllIps();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
