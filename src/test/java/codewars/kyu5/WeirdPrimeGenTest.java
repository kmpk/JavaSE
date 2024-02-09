package codewars.kyu5;

import static org.junit.Assert.*;

import codewars.kyu5.WeirdPrimeGen;
import org.junit.Test;


public class WeirdPrimeGenTest {
    @Test
    public void test1() {
        System.out.println("Fixed Tests: countOnes");
        assertEquals(8, WeirdPrimeGen.countOnes(10));
        assertEquals(90, WeirdPrimeGen.countOnes(100));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests: maxPn");
        assertEquals(47, WeirdPrimeGen.maxPn(5));
        assertEquals(101, WeirdPrimeGen.maxPn(7));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests: anOverAverage");
        assertEquals(3, WeirdPrimeGen.anOverAverage(5));
    }
}