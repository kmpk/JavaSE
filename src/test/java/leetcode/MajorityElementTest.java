package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    private static MajorityElement instance = new MajorityElement();

    @Test
    void majorityElement() {
        assertEquals(3,instance.majorityElement(new int[]{3,2,3}));
        assertEquals(2,instance.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}