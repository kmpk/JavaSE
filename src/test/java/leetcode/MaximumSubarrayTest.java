package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {

    @Test
    public void maxSubArray() {
        MaximumSubarray inst = new MaximumSubarray();
        Assert.assertEquals(6, inst.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        Assert.assertEquals(1, inst.maxSubArray(new int[]{1}));
        Assert.assertEquals(23, inst.maxSubArray(new int[]{5,4,-1,7,8}));
    }
}