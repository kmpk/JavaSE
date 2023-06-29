package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest {

    @Test
    public void rotate() {
        RotateArray inst = new RotateArray();
        int[] array;
        int rotations;
        array = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotations = 3;
        inst.rotate(array, rotations);
        Assert.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, array);
        array = new int[]{-1, -100, 3, 99};
        rotations = 2;
        inst.rotate(array, rotations);
        Assert.assertArrayEquals(new int[]{3, 99, -1, -100}, array);
    }
}