package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {
    private final RansomNote instance = new RansomNote();

    @Test
    void testEmpty() {
        assertTrue(instance.canConstruct("", ""));
    }

    @Test
    void testFalse(){
        assertFalse(instance.canConstruct("aaabb","aaabdfg"));
    }

    @Test
    void testTrue() {
        assertTrue(instance.canConstruct("aabbccddeeffgg","ggffeeddccbbaaqweertz"));
    }
}