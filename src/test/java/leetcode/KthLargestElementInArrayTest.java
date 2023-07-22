package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementInArrayTest {
    private static KthLargestElementInArray instance = new KthLargestElementInArray();

    @Test
    void findKthLargest() {
        assertEquals(5, instance.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        assertEquals(4, instance.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}