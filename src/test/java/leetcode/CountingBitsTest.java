package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingBitsTest {
    private final CountingBits instance = new CountingBits();

    @Test
    void countBits() {
        assertArrayEquals(new int[]{0,1,1},instance.countBits(2));
        assertArrayEquals(new int[]{0,1,1,2,1,2},instance.countBits(5));
    }
}