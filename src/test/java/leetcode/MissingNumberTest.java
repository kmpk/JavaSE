package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {
private static MissingNumber instance = new MissingNumber();

    @Test
    void missingNumber() {
        assertEquals(2,instance.missingNumber(new int[] {3,0,1}));
        assertEquals(2,instance.missingNumber(new int[] {0,1}));
        assertEquals(8,instance.missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
    }
}