package codewars.kuy6;

public class BitCounting {
    public static int countBits(int n) {
        return (int) Integer.toBinaryString(n)
                .chars()
                .filter(i -> (char) i == '1')
                .count();
    }
}
