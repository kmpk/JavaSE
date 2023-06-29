package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {
    PermutationInString instance = new PermutationInString();

    @Test
    void testEmpty() {
        assertFalse(instance.checkInclusion("",""));
        assertFalse(instance.checkInclusion("asd",""));
        assertTrue(instance.checkInclusion("","asd"));
    }

    @Test
    void testNoPermutations() {
        assertFalse(instance.checkInclusion("ab","qwedgfh"));
        assertFalse(instance.checkInclusion("gf","qwesdfsdfsdf"));
        assertFalse(instance.checkInclusion("a","zxcdswqe"));
    }

    @Test
    void testHasPermutations() {
        assertTrue(instance.checkInclusion("ab","zxcabsd"));
        assertTrue(instance.checkInclusion("ab","ab"));
        assertTrue(instance.checkInclusion("bbb","qwedbbbgfh"));
        assertTrue(instance.checkInclusion("a","qwedbabbgfh"));
        assertTrue(instance.checkInclusion("ab","eidbaooo"));
    }
}