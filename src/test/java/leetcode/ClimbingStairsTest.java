package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {
    private static ClimbingStairs instance = new ClimbingStairs();

    @Test
    void climbStairs() {
        assertEquals(1,instance.climbStairs(1));
        assertEquals(2,instance.climbStairs(2));
        assertEquals(3,instance.climbStairs(3));
        assertEquals(5,instance.climbStairs(4));
        assertEquals(8,instance.climbStairs(5));
    }
}