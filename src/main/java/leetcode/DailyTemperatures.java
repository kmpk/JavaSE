package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<IndexValue> deque = new LinkedList<>();
        int[] result = new int[temperatures.length];

        for (int currentIndex = 0; currentIndex < temperatures.length; currentIndex++) {
            int currentValue = temperatures[currentIndex];
            while (!deque.isEmpty() && deque.peekLast().value < currentValue) {
                int index = deque.peekLast().index;
                result[index] = currentIndex - index;
                deque.pollLast();
            }
            deque.addLast(new IndexValue(currentIndex, currentValue));
        }
        return result;
    }

    private record IndexValue(int index, int value) {
    }
}
