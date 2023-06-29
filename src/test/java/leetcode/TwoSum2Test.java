package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSum2Test {

    @Test
    public void twoSum() {
        TwoSum2 inst = new TwoSum2();
        Assert.assertArrayEquals(new int[]{1,2}, inst.twoSum(new int[]{2, 7, 11, 15}, 9));
        Assert.assertArrayEquals(new int[]{1,3}, inst.twoSum(new int[]{2,3,4}, 6));
        Assert.assertArrayEquals(new int[]{1,2}, inst.twoSum(new int[]{-1,0}, -1));
    }
}