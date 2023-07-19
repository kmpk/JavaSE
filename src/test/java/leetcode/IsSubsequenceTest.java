package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsSubsequenceTest {
    private static IsSubsequence instance = new IsSubsequence();

    @Test
    void isSubsequence() {
        assertTrue(instance.isSubsequence("", "asdasdasdads"));
        assertFalse(instance.isSubsequence("adasdasdasdasdasd", "ads"));
        assertTrue(instance.isSubsequence("abc", "ahbgdc"));
        assertFalse(instance.isSubsequence("axc", "ahbgdc"));
    }
}