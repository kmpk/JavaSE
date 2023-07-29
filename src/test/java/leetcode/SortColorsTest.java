package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortColorsTest {
    private static SortColors instance = new SortColors();

    @Test
    void sortColors() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        instance.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);

        nums = new int[]{2, 0, 1};
        instance.sortColors(nums);
        assertArrayEquals(new int[]{0, 1, 2}, nums);
    }
}