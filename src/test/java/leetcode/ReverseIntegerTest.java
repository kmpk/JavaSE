package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    private static ReverseInteger instance = new ReverseInteger();

    @Test
    void reverse() {
        assertEquals(321,instance.reverse(123));
        assertEquals(-321,instance.reverse(-123));
        assertEquals(21,instance.reverse(120));
    }
}