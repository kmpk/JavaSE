package se.codewars.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class CustomSumTest {
    @Test
    public void BasicTests() {
        assertEquals(16, CustomSum.sum(new int[] { 6, 2, 1, 8, 10}));
    }
}
