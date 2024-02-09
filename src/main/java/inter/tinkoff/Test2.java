package inter.tinkoff;

public class Test2 {
    public static void main(String[] args) {
        short i1 = Short.MAX_VALUE;
        long i2 = Long.MAX_VALUE;
        int diff = (short) (i1-i2);
        System.out.println(diff);
    }
}
