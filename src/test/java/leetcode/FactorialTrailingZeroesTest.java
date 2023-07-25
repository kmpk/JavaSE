package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTrailingZeroesTest {
    private static FactorialTrailingZeroes instance = new FactorialTrailingZeroes();

    @Test
    void trailingZeroes() {
        assertEquals(1, instance.trailingZeroes(6));
    }
}