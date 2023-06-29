package leetcode.pc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertPositionTest {

    @Test
    public void searchInsert() {
        SearchInsertPosition inst = new SearchInsertPosition();
        Assert.assertEquals(2, inst.searchInsert(new int[]{1, 3, 5, 6}, 5));
        Assert.assertEquals(1, inst.searchInsert(new int[]{1, 3, 5, 6}, 2));
        Assert.assertEquals(4, inst.searchInsert(new int[]{1, 3, 5, 6}, 7));
        Assert.assertEquals(0, inst.searchInsert(new int[]{1, 3, 5, 6}, 0));
        Assert.assertEquals(0, inst.searchInsert(new int[]{1}, 0));
    }
}