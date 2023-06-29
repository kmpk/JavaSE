package leetcode;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        return hammingWeight(x ^ y);
    }

    private int hammingWeight(int n) {
        int num = n;
        int count = 0;
        while (num != 0) {
            num &= num - 1;
            count++;
        }
        return count;
    }
}
