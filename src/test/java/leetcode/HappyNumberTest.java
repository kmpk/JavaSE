package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    void isHappy() {
        assertTrue(HappyNumber.isHappy(19));
        assertFalse(HappyNumber.isHappy(2));
    }
}