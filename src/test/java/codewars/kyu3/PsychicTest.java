package codewars.kyu3;

import codewars.kyu3.Psychic;
import org.junit.Test;

import static org.junit.Assert.*;

public class PsychicTest {
    @Test
    public void testRandom() {
        assertEquals(Psychic.guess(), java.lang.Math.random(), 0);
    }
}