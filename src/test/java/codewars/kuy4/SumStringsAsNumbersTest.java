package codewars.kuy4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumStringsAsNumbersTest {
    @Test
    void test() {
        assertEquals("1079", SumStringsAsNumbers.sumStrings("000000000000000000623", "456"));
    }
}