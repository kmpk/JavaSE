package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] intervalsCombined = new int[intervals.length + 1][];
        System.arraycopy(intervals, 0, intervalsCombined, 0, intervals.length);
        intervalsCombined[intervals.length] = newInterval;

        Arrays.sort(intervalsCombined, Comparator.comparingInt(i -> i[0]));

        Deque<int[]> deque = new LinkedList<>();
        for (int[] interval : intervalsCombined) {
            if (!deque.isEmpty() && deque.peekLast()[1] >= interval[0]) {
                int[] previousInterval = deque.pollLast();
                deque.addLast(new int[]{previousInterval[0], Math.max(interval[1], previousInterval[1])});
            } else {
                deque.addLast(interval);
            }
        }

        int size = deque.size();
        int[][] result = new int[size][];
        for (int i = 0; i < size; i++) {
            result[i] = deque.pollFirst();
        }
        return result;
    }
}
