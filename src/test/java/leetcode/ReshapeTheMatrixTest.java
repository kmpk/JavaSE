package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReshapeTheMatrixTest {

    @Test
    public void matrixReshape() {
        ReshapeTheMatrix inst = new ReshapeTheMatrix();
        int[][] array;
        array = new int[][]{{1, 2}, {3, 4}};
        Assert.assertArrayEquals(new int[][]{{1, 2, 3, 4}}, inst.matrixReshape(array, 1, 4));
        array = new int[][]{{1, 2}, {3, 4}};
        Assert.assertArrayEquals(array, inst.matrixReshape(array, 2, 2));
    }
}