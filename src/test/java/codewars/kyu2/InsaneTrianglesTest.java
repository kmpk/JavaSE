package codewars.kyu2;

import codewars.kyu2.InsaneTriangles;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsaneTrianglesTest {
    @Test
    public void examples() {
        assertEquals('B', InsaneTriangles.triangle("B"));
        assertEquals('R', InsaneTriangles.triangle("GB"));
        assertEquals('R', InsaneTriangles.triangle("RRR"));
        assertEquals('B', InsaneTriangles.triangle("RGBG"));
        assertEquals('G', InsaneTriangles.triangle("RBRGBRB"));
        assertEquals('G', InsaneTriangles.triangle("RBRGBRBGGRRRBGBBBGG"));
    }
}