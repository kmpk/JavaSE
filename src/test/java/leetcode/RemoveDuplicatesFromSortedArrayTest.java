package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    private RemoveDuplicatesFromSortedArray instance;

    @BeforeEach
    void setup() {
        instance = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    void testEmptyArray() {
        int[] array = {};
        Assertions.assertEquals(0, instance.removeDuplicates(array));
        Assertions.assertArrayEquals(new int[0], array);
    }

    @Test
    void testArrayWithSingleItem() {
        int[] array = {1};
        Assertions.assertEquals(1, instance.removeDuplicates(array));
        int[] expected = {1};
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    void testArrayWithDuplicates() {
        int[] array = {0, 0, 1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 8, 9};
        Assertions.assertEquals(10, instance.removeDuplicates(array));
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], array[i]);
        }
    }
}