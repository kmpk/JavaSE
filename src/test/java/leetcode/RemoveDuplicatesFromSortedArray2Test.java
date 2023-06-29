package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArray2Test {
    private static RemoveDuplicatesFromSortedArray2 instance = new RemoveDuplicatesFromSortedArray2();

    @Test
    void removeDuplicates() {
        assertEquals(5,instance.removeDuplicates(new int[]{1,1,1,2,2,3}));
        assertEquals(7,instance.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
        assertEquals(16,instance.removeDuplicates(new int[]{0,0,0,0,1,1,1,1,2,2,2,2,3,3,4,5,6,7,8,8,8,8,8,8,8,8,8,8,8,8,9,9,9,9,9,9,9,9,9}));
        assertEquals(2,instance.removeDuplicates(new int[]{1,2}));
    }
}