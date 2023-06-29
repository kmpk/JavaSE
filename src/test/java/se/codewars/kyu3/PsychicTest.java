package se.codewars.kyu3;

import org.junit.Test;

import static org.junit.Assert.*;

public class PsychicTest {
    @Test
    public void testRandom() {
        assertEquals(Psychic.guess(), java.lang.Math.random(), 0);
    }
}