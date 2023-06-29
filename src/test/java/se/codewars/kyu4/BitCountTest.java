package se.codewars.kyu4;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class BitCountTest {
    @Test
    public void sampleTests() {
        assertEquals(new BigInteger("7"), BitCount.countOnes(5,7));
        assertEquals(new BigInteger("51"), BitCount.countOnes(12,29));
        assertEquals(new BigInteger("0"), BitCount.countOnes(1,200000000000000L));
    }
}