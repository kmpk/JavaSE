package codewars.kyu7;

import static org.junit.Assert.*;

import codewars.kyu7.NthSeries;
import org.junit.Test;


public class NthSeriesTest {

    @Test
    public void test1() {
        assertEquals(NthSeries.seriesSum(5), "1.57");
    }
    @Test
    public void test2() {
        assertEquals(NthSeries.seriesSum(9), "1.77");
    }
    @Test
    public void test3() {
        assertEquals(NthSeries.seriesSum(15), "1.94");
    }
}
