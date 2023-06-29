package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test1Test {
    @Test
    public void testLongestPrefixReturned() {
        assertEquals("must be equal", "ab", Test1.longestPrefix(new String[]{"ab", "abc", "abcde", "abf"}));
    }

    @Test
    public void testOneOfStringsInArrayIsEmpty(){
        assertEquals("",Test1.longestPrefix(new String[]{"avds","asd","","asd"}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentExceptionOnNull() {
        String result = Test1.longestPrefix(null);
    }

    @Test
    public void testEmptyStringOnEmptyArray() {
        assertEquals("must be equal", "", Test1.longestPrefix(new String[]{}));
    }

    @Test
    public void testOneStringInArray(){
        assertEquals("asd",Test1.longestPrefix(new String[]{"asd"}));
    }
}