package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    private static GroupAnagrams instance = new GroupAnagrams();

    @Test
    void groupAnagrams() {
        assertEquals(List.of(List.of("eat","tea","ate"),List.of("bat"),List.of("tan","nat")),instance.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
        assertEquals(List.of(),instance.groupAnagrams(new String[]{}));
    }
}