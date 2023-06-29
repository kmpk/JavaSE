package leetcode;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class PlusOneTest {
    private PlusOne instance = new PlusOne();

    @Test
    void testNoOverflow() {
        int[] array = {1, 0, 0, 2, 5};
        int[] result = {1, 0, 0, 2, 6};
        Assertions.assertArrayEquals(result, instance.plusOne(array));
    }

    @Test
    void testOverflow() {
        int[] array = {1, 0, 0, 2, 9};
        int[] result = {1, 0, 0, 3, 0};
        Assertions.assertArrayEquals(result, instance.plusOne(array));
    }

    @Test
    void testOverflowHighestRank() {
        int[] array = {9, 9, 9, 9, 9};
        int[] result = {1, 0, 0, 0, 0, 0};
        Assertions.assertArrayEquals(result, instance.plusOne(array));
    }
}