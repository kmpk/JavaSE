package inter;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimesTest {

    @Test
    void primesUpToLowValues() {
        assertEquals(0, Primes.primesUpTo(0));
        assertEquals(0, Primes.primesUpTo(1));
        assertEquals(0, Primes.primesUpTo(2));
        assertEquals(1, Primes.primesUpTo(3));
        assertEquals(2, Primes.primesUpTo(4));
    }

    @Test
    void primesUpToHighValues() {
        assertEquals(15, Primes.primesUpTo(50));
    }
}