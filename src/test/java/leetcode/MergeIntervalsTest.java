package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeIntervalsTest {
    private static MergeIntervals instance = new MergeIntervals();

    @Test
    void merge() {
        assertArrayEquals(new int[][]{{1,5}}, instance.merge(new int[][]{{1, 4}, {4, 5}}));
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, instance.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }
}