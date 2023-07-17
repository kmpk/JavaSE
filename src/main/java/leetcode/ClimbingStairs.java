package leetcode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int cur = 1;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            int neww = cur + prev;
            prev = cur;
            cur = neww;
        }
        return cur;
    }
}
