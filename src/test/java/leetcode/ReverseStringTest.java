package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverseString() {
        ReverseString inst = new ReverseString();
        char[] array;
        array = new char[]{'h', 'e', 'l', 'l', 'o'};
        inst.reverseString(array);
        Assert.assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, array);
    }
}