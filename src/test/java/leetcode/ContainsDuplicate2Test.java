package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicate2Test {

    @Test
    void containsNearbyDuplicate() {
        assertTrue(ContainsDuplicate2.containsNearbyDuplicate(new int[]{1,2,3,1},3));
        assertTrue(ContainsDuplicate2.containsNearbyDuplicate(new int[]{1,0,1,1},1));
        assertFalse(ContainsDuplicate2.containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
    }
}