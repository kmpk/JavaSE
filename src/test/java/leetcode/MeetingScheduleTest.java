package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MeetingScheduleTest {
    private final MeetingSchedule instance = new MeetingSchedule();

    @Test
    void canAttendMeetings() {
        Assertions.assertFalse(instance.canAttendMeetings(List.of(new MeetingSchedule.Interval(0, 30), new MeetingSchedule.Interval(5, 10), new MeetingSchedule.Interval(15, 20))));
        Assertions.assertTrue(instance.canAttendMeetings(List.of(new MeetingSchedule.Interval(5, 8), new MeetingSchedule.Interval(9, 15))));
    }
}