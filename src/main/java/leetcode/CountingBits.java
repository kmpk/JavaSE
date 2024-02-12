package leetcode;

public class CountingBits {
    public int[] countBits(int n) {
        int result[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            result[i] = 1 + result[i & (i - 1)];
        }
        return result;
    }
}
