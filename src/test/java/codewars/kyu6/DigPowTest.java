package codewars.kyu6;
import static org.junit.Assert.*;

import codewars.kyu6.DigPow;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class DigPowTest {

    @Test
    public void Test1() {
        assertEquals(1, DigPow.digPow(89, 1));
    }
    @Test
    public void Test2() {
        assertEquals(-1, DigPow.digPow(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(51, DigPow.digPow(46288, 3));
    }
}
