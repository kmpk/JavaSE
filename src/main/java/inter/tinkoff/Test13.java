package inter.tinkoff;

public final class Test13 {
    public static final void main(String[] args) {
        new Thread(()-> System.out.println("T 1")).start();
        System.out.println("T 0");
    }
}
