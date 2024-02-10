package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NextGreaterElementITest {
    private final NextGreaterElementI instance = new NextGreaterElementI();

    @Test
    void nextGreaterElement() {
        assertArrayEquals(new int[]{-1, 3, -1}, instance.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
        assertArrayEquals(new int[]{3, -1}, instance.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4}));
    }
}