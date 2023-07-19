package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {
    private static WordPattern instance = new WordPattern();

    @Test
    void wordPattern() {
        assertTrue(instance.wordPattern("abba","dog cat cat dog"));
    }
}