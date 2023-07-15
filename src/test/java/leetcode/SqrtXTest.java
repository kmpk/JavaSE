package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtXTest {

    @Test
    void mySqrt() {
        assertEquals(2,SqrtX.mySqrt(4));
        assertEquals(3,SqrtX.mySqrt(9));
        assertEquals(11,SqrtX.mySqrt(121));
        assertEquals(11,SqrtX.mySqrt(122));
        assertEquals(46339,SqrtX.mySqrt(2147395599));

    }
}