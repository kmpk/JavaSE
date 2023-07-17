package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {
    private static RomanToInteger instance = new RomanToInteger();

    @Test
    void romanToInt() {
        assertEquals(3,instance.romanToInt("III"));
        assertEquals(58,instance.romanToInt("LVIII"));
        assertEquals(1994,instance.romanToInt("MCMXCIV"));
    }
}