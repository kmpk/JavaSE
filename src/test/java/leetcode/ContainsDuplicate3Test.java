package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicate3Test {

    @Test
    void containsNearbyDuplicate() {
        assertTrue(ContainsDuplicate3.containsNearbyAlmostDuplicate(new int[]{1,2,3,1},3,0));
        assertFalse(ContainsDuplicate3.containsNearbyAlmostDuplicate(new int[]{1,5,9,1,5,9},2,3));
    }
}