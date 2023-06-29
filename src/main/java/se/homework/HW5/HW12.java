package se.homework.HW5;

public class HW12 {
    int cap;

    public void finalize() {
        if (cap > 0) System.out.println("tank is not empty!");
    }

    public HW12(int i) {
        this.cap = i;
    }

    public static void main(String... a) throws InterruptedException{
        new HW12(0);
        new HW12(10);
        System.gc();
        Thread.sleep(10);
    }
}
