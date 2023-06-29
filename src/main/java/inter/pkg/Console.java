package inter.pkg;

import java.io.IOException;
import java.nio.file.Path;
import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Console {
    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length != 1) {
            System.out.println("Pass file path as command-line argument, example: \"/path/to/file\"");
            System.exit(0);
        }
        List<Integer> byteBuffers = List.of(1024*1024);
        List<Integer> buffers = List.of(1000000);
        for (int bb : byteBuffers) {
            for (int b : buffers) {
                LocalTime start = LocalTime.now();
                System.out.printf("!!!Using buffer %d, bytebuffer %d!!!%n", b, bb);
                extracted(args[0], b, bb);
                System.out.println("Elapsed: " + Duration.between(LocalTime.now(), start).toString());
            }
        }
    }

    private static void extracted(String arg, int buffer, int bytebuffer) throws InterruptedException {
//        System.out.println("Started: " + LocalDateTime.now());
        IntegerCounter counter = new IntegerCounter();
        int i = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newCachedThreadPool();

        Path of = Path.of(arg);
        long length = of.toFile().length();
//        System.out.println("length: " + length);
        long block = Math.max(length / i, 1024*1024);
        long leftBound = 0;
        while (leftBound < length) {
            long rightBound = Math.min(leftBound + block + 20, length);
            service.execute(new FileIpReader(new IpBuffer(buffer, counter), of, leftBound, rightBound, bytebuffer));
            leftBound = rightBound == length ? rightBound : rightBound - 20;
        }
//        reader.getLinesStream()
//                .parallel()
//                .forEach(s-> counter.add(parseIp(s)));
        service.shutdown();
        service.awaitTermination(1, TimeUnit.HOURS);
        System.out.println(counter.size());
//        System.out.println("Ended: " + LocalDateTime.now());
    }
}
