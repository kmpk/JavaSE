package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HammingDistanceTest {
    private static HammingDistance instance = new HammingDistance();

    @Test
    void hammingDistance() {
        assertEquals(2,instance.hammingDistance(1,4));
        assertEquals(1,instance.hammingDistance(3,1));
    }
}