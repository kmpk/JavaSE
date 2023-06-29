package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZeroesTest {

    @Test
    public void moveZeroes() {
        MoveZeroes inst = new MoveZeroes();
        int[] array;
        int[] result;
        array = new int[]{0, 1, 0, 3, 12};
        inst.moveZeroes(array);
        result = new int[]{1, 3, 12, 0, 0};
        Assert.assertArrayEquals(result, array);
        array = new int[]{0};
        inst.moveZeroes(array);
        result = new int[]{0};
        Assert.assertArrayEquals(result, array);
        array = new int[]{1,0};
        inst.moveZeroes(array);
        result = new int[]{1,0};
        Assert.assertArrayEquals(result, array);
    }
}