package codewars.kyu8;

import codewars.kyu8.OppositesAttract;
import org.junit.Test;

import static org.junit.Assert.*;

public class OppositesAttractTest {

    @Test
    public void EvenEvenTest() {
        assertFalse(OppositesAttract.isLove(2, 2));
    }
    @Test
    public void OddOddTest(){
        assertFalse(OppositesAttract.isLove(1,1));
    }
    @Test
    public void OddEvenTest(){
        assertTrue(OppositesAttract.isLove(1,2));
    }
    @Test
    public void EvenOddTest(){
        assertTrue(OppositesAttract.isLove(2,1));
    }
}