package leetcode;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;
        long divider = 5;
        while (n >= divider) {
            count += n / divider;
            divider *= 5;
        }
        return count;
    }
}
