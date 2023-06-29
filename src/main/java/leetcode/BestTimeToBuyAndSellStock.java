package leetcode;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int[] diffs = new int[prices.length];
        for (int i = 1; i < diffs.length; i++) {
            diffs[i] = prices[i] - prices[i - 1];
        }
        diffs[0] = 0;
        int currentMax = 0;
        int max = 0;
        for (int diff : diffs) {
            currentMax += diff;
            currentMax = Math.max(0, currentMax);
            max = Math.max(currentMax, max);
        }
        return max;
    }
}
