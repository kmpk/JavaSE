package inter.pkg;

public class IpBuffer {
    private final int[] buffer;
    private int pos = 0;
    private final IntegerCounter counter;

    public IpBuffer(int size, IntegerCounter counter) {
        if (size <= 0) {
            throw new IllegalArgumentException("size must be bigger than 0");
        }
        this.buffer = new int[size];
        this.counter = counter;
    }

    public void accept(int ip) {
        if (pos == buffer.length) {
            flushIps();
        }
        buffer[pos] = ip;
        pos++;
    }

    public void flush() {
        if (pos > 0) {
            flushIps();
        }
    }

    private void flushIps() {
        counter.add(buffer, pos);
        pos = 0;
    }
}
