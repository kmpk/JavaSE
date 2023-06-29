package codewars.beta;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class OddTrianglesTest {
    @Test
    public void Test1()
    {
        assertEquals(BigInteger.ZERO, OddTriangles.sum(0));
    }
    @Test
    public void Test2()
    {
        assertEquals(BigInteger.ONE, OddTriangles.sum(1));
    }
    @Test
    public void Test3()
    {
        assertEquals(new BigInteger("9"), OddTriangles.sum(2));
    }
}