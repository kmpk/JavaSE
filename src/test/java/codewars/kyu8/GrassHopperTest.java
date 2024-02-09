package codewars.kyu8;

import codewars.kyu8.GrassHopper;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrassHopperTest {
    @Test
    public void test1() {
        assertEquals(1,
                GrassHopper.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
                GrassHopper.summation(8));
    }
}