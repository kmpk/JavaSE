package codewars.kyu6;

import codewars.kyu6.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void fewElems() {
        Assert.assertArrayEquals(
                new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34},
                Fibonacci.stream(0, 1).limit(10).toArray());

    }

}
