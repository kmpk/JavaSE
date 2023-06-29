package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPrimesTest {

    private CountPrimes instance = new CountPrimes();

    @Test
    void testZeroAndOne() {
        Assertions.assertEquals(0, instance.countPrimes(0));
        Assertions.assertEquals(0, instance.countPrimes(1));
    }

    @Test
    void test() {
        Assertions.assertEquals(4, instance.countPrimes(10));
    }

    @Test
    void testLarge() {
        Assertions.assertEquals(41537, instance.countPrimes(499979));
    }
}