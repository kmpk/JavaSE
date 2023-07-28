package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoIntegersTest {
    private static SumOfTwoIntegers instance = new SumOfTwoIntegers();

    @Test
    void getSum() {
        assertEquals(2,instance.getSum(1,1));
        assertEquals(-5,instance.getSum(-4,-1));
        assertEquals(-1,instance.getSum(10,-11));
        assertEquals(11000,instance.getSum(1000,10000));
    }
}