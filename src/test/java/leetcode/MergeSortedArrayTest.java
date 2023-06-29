package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {

    @Test
    public void merge() {
        MergeSortedArray inst = new MergeSortedArray();
        int[] array1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] array2 = new int[]{2, 5, 6};
        inst.merge(array1, 3, array2, 3);
        Assert.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, array1);
        array1=new int[]{1};
        array2=new int[]{};
        inst.merge(array1,1,array2,0);
        Assert.assertArrayEquals(new int[]{1}, array1);
        array1=new int[]{0};
        array2=new int[]{1};
        inst.merge(array1,0,array2,1);
        Assert.assertArrayEquals(new int[]{1}, array1);


    }
}