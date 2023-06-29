package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    private ValidPalindrome instance = new ValidPalindrome();

    @Test
    void testEmpty() {
        assertTrue(instance.isPalindrome(""));
        assertTrue(instance.isPalindrome(" , :"));
        assertTrue(instance.isPalindrome(" : :"));
        assertTrue(instance.isPalindrome(" ' '"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(instance.isPalindrome(" a a"));
        assertTrue(instance.isPalindrome(" a : !!@#$%^&*()'''''''' a"));
        assertTrue(instance.isPalindrome(" abbb  a"));
        assertTrue(instance.isPalindrome("123p123321:!p"));
    }

    @Test
    void testIsNotPalindrome() {
        assertFalse(instance.isPalindrome("race a car"));
        assertFalse(instance.isPalindrome("0P"));
    }
}