package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchA2DMatrixTest {

    @Test
    public void searchMatrix() {
        SearchA2DMatrix inst = new SearchA2DMatrix();
        int[][] matrix;
        int target;
        matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        target = 1;
        Assert.assertTrue(inst.searchMatrix(matrix, target));
        target = 3;
        Assert.assertTrue(inst.searchMatrix(matrix, target));
        target = 5;
        Assert.assertTrue(inst.searchMatrix(matrix, target));
        target = 7;
        Assert.assertTrue(inst.searchMatrix(matrix, target));
        target = 10;
        Assert.assertTrue(inst.searchMatrix(matrix, target));
        target = 11;
        Assert.assertTrue(inst.searchMatrix(matrix, target));
        target = 16;
        Assert.assertTrue(inst.searchMatrix(matrix, target));
        target = 20;
        Assert.assertTrue(inst.searchMatrix(matrix, target));
        target = 23;
        Assert.assertTrue(inst.searchMatrix(matrix, target));
        target = 30;
        Assert.assertTrue(inst.searchMatrix(matrix, target));
        target = 34;
        Assert.assertTrue(inst.searchMatrix(matrix, target));
        target = 60;
        Assert.assertTrue(inst.searchMatrix(matrix, target));
        target = 13;
        Assert.assertFalse(inst.searchMatrix(matrix, target));
    }
}