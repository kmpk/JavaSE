package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void maxProfit() {
        BestTimeToBuyAndSellStock inst = new BestTimeToBuyAndSellStock();
        int[] array;
        int result;
        array = new int[]{7, 1, 5, 3, 6, 4};
        result = 5;
        Assert.assertEquals(result, inst.maxProfit(array));
        array = new int[]{7,6,4,3,1};
        result = 0;
        Assert.assertEquals(result, inst.maxProfit(array));
    }
}