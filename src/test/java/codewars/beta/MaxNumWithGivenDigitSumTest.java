package codewars.beta;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumWithGivenDigitSumTest {
    @Test
    public void testMax() {
        assertEquals(8543210, MaxNumWithGivenDigitSum.max(23));
        assertEquals(953210, MaxNumWithGivenDigitSum.max(20));
        assertEquals(98743210, MaxNumWithGivenDigitSum.max(34));
        assertEquals(987654320, MaxNumWithGivenDigitSum.max(44));
    }

    // corner input,
    @Test
    public void testMaxCorner() {
        assertEquals(0, MaxNumWithGivenDigitSum.max(0));
        assertEquals(9876543210L, MaxNumWithGivenDigitSum.max(45));
        assertEquals(10, MaxNumWithGivenDigitSum.max(1));
    }

    // invalid input,
    @Test
    public void testMaxInvalid() {
        assertEquals(-1, MaxNumWithGivenDigitSum.max(-1));
        assertEquals(-1, MaxNumWithGivenDigitSum.max(46));
    }
}