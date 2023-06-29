package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOf1BitsTest {
    private static NumberOf1Bits instance = new NumberOf1Bits();

    @Test
    void hammingWeight() {
        assertEquals(31, instance.hammingWeight(-3));
        assertEquals(1, instance.hammingWeight(128));
        assertEquals(3, instance.hammingWeight(11));
    }
}