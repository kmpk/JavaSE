package codewars.kyu8;

import codewars.kyu8.CustomSum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomSumTest {
    @Test
    public void BasicTests() {
        assertEquals(16, CustomSum.sum(new int[] { 6, 2, 1, 8, 10}));
    }
}
