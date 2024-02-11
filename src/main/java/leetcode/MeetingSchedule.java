package leetcode;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MeetingSchedule {
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals = intervals.stream().sorted(Comparator.comparingInt(i -> i.start)).toList();

        Interval previous = null;
        Interval current = null;

        Iterator<Interval> iterator = intervals.iterator();
        while (iterator.hasNext()){
            previous = current;
            current = iterator.next();
            if (previous!=null && previous.end>= current.start){
                return false;
            }
        }

        return true;
    }

    public static class Interval {
        public int start, end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
