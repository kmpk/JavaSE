package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class IsomorphicStringsTest {
    private static IsomorphicStrings instance = new IsomorphicStrings();

    @Test
    void isIsomorphic() {
        assertTrue(instance.isIsomorphic("egg","add"));
        assertFalse(instance.isIsomorphic("foo","bar"));
        assertFalse(instance.isIsomorphic("badc","baba"));
        assertTrue(instance.isIsomorphic("paper","title"));
    }
}