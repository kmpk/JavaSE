package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PascalsTriangleTest {

    @Test
    public void generate() {
        PascalsTriangle inst = new PascalsTriangle();
        System.out.println(inst.generate(10));
    }
}