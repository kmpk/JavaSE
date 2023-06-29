package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseBitsTest {
    private static ReverseBits instance = new ReverseBits();

    @Test
    void reverseBits() {
        assertEquals(964176192,instance.reverseBits(43261596));
    }
}