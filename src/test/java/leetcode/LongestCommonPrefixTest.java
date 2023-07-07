package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    private final static LongestCommonPrefix instance = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix() {
        assertEquals("fl",instance.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("",instance.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}