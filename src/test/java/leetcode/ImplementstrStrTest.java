package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ImplementstrStrTest {
    private static ImplementstrStr instance = new ImplementstrStr();

    @Test
    void strStr() {
        assertEquals(0,instance.strStr("sadbutsad","sad"));
        assertEquals(-1,instance.strStr("leetcode","leeto"));
    }
}