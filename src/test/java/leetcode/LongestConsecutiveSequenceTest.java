package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    @Test
    void longestConsecutive() {
        assertEquals(4,LongestConsecutiveSequence.longestConsecutive(new int[]{9,1,-3,2,4,8,3,-1,6,-2,-4,7}));
        assertEquals(4,LongestConsecutiveSequence.longestConsecutive(new int[]{100,4,200,1,3,2}));
        assertEquals(9,LongestConsecutiveSequence.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
        assertEquals(0,LongestConsecutiveSequence.longestConsecutive(new int[]{}));
        assertEquals(10,LongestConsecutiveSequence.longestConsecutive(new int[]{0,1,2,4,8,5,6,7,9,3,55,88,77,99,999999999}));
    }
}