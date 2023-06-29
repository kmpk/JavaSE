package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class IntersectionOfTwoArrays2Test {

    @Test
    public void intersect() {
        IntersectionOfTwoArrays2 inst = new IntersectionOfTwoArrays2();
        int[] result = new int[]{2, 2};
        int[] intersect = inst.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        Arrays.sort(intersect);
        Arrays.sort(result);
        Assert.assertArrayEquals(result, intersect);
        result = new int[]{4, 9};
        intersect = inst.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        Arrays.sort(intersect);
        Arrays.sort(result);
        Assert.assertArrayEquals(result, intersect);
    }
}