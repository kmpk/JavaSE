package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestNumberTest {
    private static LargestNumber instance = new LargestNumber();

    @Test
    void largestNumber() {
//        assertEquals("210", instance.largestNumber(new int[]{10, 2}));
        assertEquals("9534330", instance.largestNumber(new int[]{3, 30, 34, 5, 9}));
    }

    @Test
    void comparatorTest() {
        Comparator<Integer> comparator = instance.comparator;
        assertEquals(1, comparator.compare(3, 30));
        assertEquals(1, comparator.compare(3, 34));
        assertEquals(-1, comparator.compare(3, 5));
        assertEquals(-1, comparator.compare(3, 9));
        assertEquals(-1, comparator.compare(30, 3));
        assertEquals(-1, comparator.compare(34, 3));
        assertEquals(1, comparator.compare(5, 3));
        assertEquals(1, comparator.compare(9, 3));
    }
}