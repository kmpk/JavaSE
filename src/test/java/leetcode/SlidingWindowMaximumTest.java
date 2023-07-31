package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SlidingWindowMaximumTest {
    private static SlidingWindowMaximum instance = new SlidingWindowMaximum();

    @Test
    void maxSlidingWindow() {
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, instance.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
        assertArrayEquals(new int[]{1}, instance.maxSlidingWindow(new int[]{1}, 1));
        assertArrayEquals(new int[]{1,-1}, instance.maxSlidingWindow(new int[]{1,-1}, 1));
        assertArrayEquals(new int[]{10,10,9,2}, instance.maxSlidingWindow(new int[]{9,10,9,-7,-4,-8,2,-6}, 5));
    }
}