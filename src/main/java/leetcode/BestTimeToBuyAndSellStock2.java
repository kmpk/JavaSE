package leetcode;

public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int profit = 0;

        int currentMin = Integer.MAX_VALUE;
        int currentMax = 0;
        int previous = 0;

        for (int price : prices) {
            if (previous > price) {
                profit += Math.max(0, currentMax - currentMin);
                currentMax = 0;
                currentMin = Integer.MAX_VALUE;
            }
            currentMax = Math.max(price, currentMax);
            currentMin = Math.min(price, currentMin);
            previous = price;
        }
        profit += Math.max(0, currentMax - currentMin);
        return profit;
    }
}
