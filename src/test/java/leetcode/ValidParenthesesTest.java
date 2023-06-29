package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    private static ValidParentheses instance = new ValidParentheses();

    @Test
    void isValid() {
        assertTrue(instance.isValid("((((({{{}}})))))"));
        assertTrue(instance.isValid("(){}[]"));
        assertTrue(instance.isValid("([{}])"));
        assertFalse(instance.isValid("((((({{{}}}))))}"));
        assertFalse(instance.isValid("((((({{{}}}))))}"));
        assertFalse(instance.isValid("((((({{{}}}))))}"));
    }
}