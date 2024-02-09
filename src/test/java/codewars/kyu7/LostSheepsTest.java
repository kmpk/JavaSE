package codewars.kyu7;

import codewars.kyu7.LostSheeps;
import org.junit.Test;

import static org.junit.Assert.*;

public class LostSheepsTest {
    @Test
    public void basicTests() {
        assertEquals(5, LostSheeps.lostSheeps(new int[]{1, 2}, new int[]{3, 4}, 15));
        assertEquals(6, LostSheeps.lostSheeps(new int[]{3, 1, 2}, new int[]{4, 5}, 21));
    }
}