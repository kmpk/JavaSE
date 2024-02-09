package codewars.kyu2;

import codewars.kyu2.InfiniteDigitalString;

import static org.junit.Assert.*;

import org.junit.Test;

public class InfiniteDigitalStringTest {

    private static Object[][] DATA = new Object[][]{new Object[]{"112", 12L, "...444546..."},
            new Object[]{"456", 3L, "...3456..."},
            new Object[]{"455", 98L, "...545556..."},
            new Object[]{"910", 8L, "...7891011..."},
            new Object[]{"9100", 188L, "...9899100..."},
            new Object[]{"99100", 187L, "...9899100..."},
            new Object[]{"00101", 190L, "...9899100..."},
            new Object[]{"001", 190L, "...9899100..."},
            new Object[]{"00", 190L, "...9899100..."},
            new Object[]{"123456789", 0L, ""},
            new Object[]{"1234567891", 0L, ""},
            new Object[]{"123456798", 1000000071L, ""},
            new Object[]{"10", 9L, ""},
            new Object[]{"53635", 13034L, ""},
            new Object[]{"040", 1091L, ""}};

    @Test
    public void sampleTests() {
        for (Object[] t : DATA) {
            String s = (String) t[0],
                    msg = (String) t[2];
            long expected = (long) t[1];
            assertEquals(msg, expected, InfiniteDigitalString.findPosition(s));
        }
        assertNotEquals(-1L, InfiniteDigitalString.findPosition("040"));
    }
}
