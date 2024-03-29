package codewars.kyu6;

import codewars.kyu6.MiddleExample;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleExampleTests {
    @Test
    public void evenTests() {
        assertEquals("es", MiddleExample.getMiddle("test"));
        assertEquals("dd", MiddleExample.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", MiddleExample.getMiddle("testing"));
        assertEquals("A", MiddleExample.getMiddle("A"));
    }
}
