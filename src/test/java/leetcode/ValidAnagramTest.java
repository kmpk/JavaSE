package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    private final ValidAnagram instance = new ValidAnagram();

    @Test
    void testEmpty() {
        assertTrue(instance.isAnagram("", ""));
    }

    @Test
    void testNotValid() {
        assertFalse(instance.isAnagram("abcde", "abcdq"));
        assertFalse(instance.isAnagram("abcde", ""));
        assertFalse(instance.isAnagram("", "abcde"));
    }

    @Test
    void testValid() {
        assertTrue(instance.isAnagram("abc", "abc"));
        assertTrue(instance.isAnagram("abc", "cba"));
        assertTrue(instance.isAnagram("abc", "cab"));
        assertTrue(instance.isAnagram("abc", "bac"));
        assertTrue(instance.isAnagram("gfedcba", "abcdefg"));
    }
}