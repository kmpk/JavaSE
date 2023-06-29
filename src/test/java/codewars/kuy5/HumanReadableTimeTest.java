package codewars.kuy5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanReadableTimeTest {

    @Test
    void makeReadable() {
        assertEquals("00:00:00", HumanReadableTime.makeReadable(0));
        assertEquals("00:00:05", HumanReadableTime.makeReadable(5));
        assertEquals("00:01:00", HumanReadableTime.makeReadable(60));
        assertEquals("23:59:59", HumanReadableTime.makeReadable(86399));
        assertEquals("99:59:59", HumanReadableTime.makeReadable(359999));
    }
}