package se.codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddOrEvenTest {
    @Test
    public void exampleTest() {
        assertEquals("odd", OddOrEven.oddOrEven(new int[] {2, 5, 34, 6}));
    }
}