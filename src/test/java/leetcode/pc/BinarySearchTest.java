package leetcode.pc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    public static final BinarySearch BINARY_SEARCH = new BinarySearch();

    @Test
    public void test1() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int result = BINARY_SEARCH.search(nums, -1);
        Assert.assertEquals(0, result);
        result = BINARY_SEARCH.search(nums, 0);
        Assert.assertEquals(1, result);
        result = BINARY_SEARCH.search(nums, 3);
        Assert.assertEquals(2, result);
        result = BINARY_SEARCH.search(nums, 5);
        Assert.assertEquals(3, result);
        result = BINARY_SEARCH.search(nums, 9);
        Assert.assertEquals(4, result);
        result = BINARY_SEARCH.search(nums, 12);
        Assert.assertEquals(5, result);
        nums = new int[]{};
        result = BINARY_SEARCH.search(nums, 100);
        Assert.assertEquals(-1, result);
        nums = new int[]{1};
        result = BINARY_SEARCH.search(nums, 1);
        Assert.assertEquals(0, result);
    }
}