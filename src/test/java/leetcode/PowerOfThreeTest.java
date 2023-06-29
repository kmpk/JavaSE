package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {

    @Test
    void isPowerOfThree() {
        PowerOfThree inst = new PowerOfThree();
        assertTrue(inst.isPowerOfThree(3));
        assertTrue(inst.isPowerOfThree(3*3));
        assertTrue(inst.isPowerOfThree(3*3*3));
        assertTrue(inst.isPowerOfThree(3*3*3*3));
        assertTrue(inst.isPowerOfThree(3*3*3*3*3));
        assertTrue(inst.isPowerOfThree(3*3*3*3*3*3));
        assertTrue(inst.isPowerOfThree(3*3*3*3*3*3*3));
    }

    @Test
    void isNotPowerOfThree() {
        PowerOfThree inst = new PowerOfThree();
        assertFalse(inst.isPowerOfThree(3*2));
        assertFalse(inst.isPowerOfThree(3*3*2));
        assertFalse(inst.isPowerOfThree(3*3*3*2));
        assertFalse(inst.isPowerOfThree(3*3*3*3*2));
        assertFalse(inst.isPowerOfThree(3*3*3*3*3*2));
        assertFalse(inst.isPowerOfThree(3*3*3*3*3*3*2));
        assertFalse(inst.isPowerOfThree(3*3*3*3*3*3*3*2));
    }
}