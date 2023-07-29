package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TopKFrequentElementsTest {
    private static TopKFrequentElements instance = new TopKFrequentElements();

    @Test
    void topKFrequent() {
        assertArrayEquals(new int[]{1, 2}, instance.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
        assertArrayEquals(new int[]{1}, instance.topKFrequent(new int[]{1}, 1));
    }
}