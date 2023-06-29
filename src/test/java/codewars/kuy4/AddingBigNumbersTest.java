package codewars.kuy4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingBigNumbersTest {

    @Test
    void basicTests() {
        assertEquals("2", AddingBigNumbers.add("1", "1"));
        assertEquals("579", AddingBigNumbers.add("123", "456"));
        assertEquals("1110", AddingBigNumbers.add("888", "222"));
        assertEquals("1441", AddingBigNumbers.add("1372", "69"));
        assertEquals("468", AddingBigNumbers.add("12", "456"));
        assertEquals("201", AddingBigNumbers.add("100", "101"));
        assertEquals("91002328220491911630239667963", AddingBigNumbers.add("63829983432984289347293874", "90938498237058927340892374089"));
    }
}