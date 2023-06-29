package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStock2Test {
    private BestTimeToBuyAndSellStock2 instance;

    @BeforeEach
    void setUp() {
        instance = new BestTimeToBuyAndSellStock2();
    }

    @Test
    void testEmptyAndSingleElement() {
        Assertions.assertEquals(0, instance.maxProfit(new int[0]));
        int[] prices = {100};
        Assertions.assertEquals(0, instance.maxProfit(prices));
    }

    @Test
    void test() {
        int[] prices = {1, 2, 5, 4, 8, 1, 10};
        Assertions.assertEquals(17, instance.maxProfit(prices));
        prices = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        Assertions.assertEquals(0, instance.maxProfit(prices));
        prices = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        Assertions.assertEquals(0, instance.maxProfit(prices));
        prices = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertEquals(8, instance.maxProfit(prices));
    }
}