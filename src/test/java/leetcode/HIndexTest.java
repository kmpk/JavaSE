package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HIndexTest {
    private static HIndex instance = new HIndex();

    @Test
    void hIndex() {
        assertEquals(3, instance.hIndex(new int[]{3, 0, 6, 1, 5}));
        assertEquals(1, instance.hIndex(new int[]{1, 3, 1}));
    }
}