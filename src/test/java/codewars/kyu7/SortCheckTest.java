package codewars.kyu7;

import codewars.kyu7.SortCheck;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SortCheckTest {

    @Test
    public void test1() {
        int[] array = new int[] {1, 2};
        assertEquals("yes, ascending", SortCheck.isSortedAndHow(array));
    }

    @Test
    public void test2() {
        int[] array = new int[] {15, 7, 3, -8};
        assertEquals("yes, descending", SortCheck.isSortedAndHow(array));
    }

    @Test
    public void test3() {
        int[] array = new int[] {4, 2, 30};
        assertEquals("no", SortCheck.isSortedAndHow(array));
    }

}
