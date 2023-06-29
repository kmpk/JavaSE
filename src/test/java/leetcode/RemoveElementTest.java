package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    private static RemoveElement instance = new RemoveElement();

    @Test
    void removeElement() {
        assertEquals(2,instance.removeElement(new int[]{3,2,2,3},3));
        assertEquals(5,instance.removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}