package se.codewars.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolTest {

    @Test
    public void testNormalCondition() {
        assertEquals(9, Sol.solveSuperMarketQueue(new int[]{2, 2, 3, 3, 4, 4}, 2));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, Sol.solveSuperMarketQueue(new int[]{}, 1));
    }

    @Test
    public void testSingleTillManyCustomers() {
        assertEquals(15, Sol.solveSuperMarketQueue(new int[]{1, 2, 3, 4, 5}, 1));
    }

}