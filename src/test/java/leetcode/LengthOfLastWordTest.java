package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {
    private static final LengthOfLastWord instance = new LengthOfLastWord();

    @Test
    void lengthOfLastWord() {
        assertEquals(5,instance.lengthOfLastWord("Hello World"));
        assertEquals(4,instance.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6,instance.lengthOfLastWord("luffy is still joyboy"));
    }
}