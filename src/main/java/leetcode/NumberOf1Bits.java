package leetcode;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int num = n;
        int count = 0;
        while (num != 0) {
            num &= num - 1;
            count++;
        }
        return count;
    }
}
