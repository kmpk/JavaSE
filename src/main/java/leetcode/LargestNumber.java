package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LargestNumber {
    public final Comparator<Integer> comparator = (o1, o2) -> {
        int first = o1 * 10;
        int second = o2 * 10;

        if (first == second) {
            return 0;
        }
        if (first == 0) {
            return -1;
        }
        if (second == 0) {
            return 1;
        }

        int firstDecimal = (int) Math.log10(first);
        int secondDecimal = (int) Math.log10(second);
        while (firstDecimal > 0 && secondDecimal > 0) {
            int firstPow = (int) Math.pow(10, firstDecimal);
            int firstDigit = first / firstPow;
            first %= firstPow;
            firstDecimal--;

            int secondPow = (int) Math.pow(10, secondDecimal);
            int secondDigit = second / secondPow;
            second %= secondPow;
            secondDecimal--;

            if (firstDigit > secondDigit) {
                return 1;
            } else if (secondDigit > firstDigit) {
                return -1;
            }

            if (first == 0 && second == 0) {
                break;
            }
        }

        if (firstDecimal > secondDecimal) {
            return -1;
        } else if (secondDecimal > firstDecimal) {
            return 1;
        }

        return 0;
    };

    public String largestNumber(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(comparator.reversed());
        for (int num : nums) {
            queue.add(num);
        }
        StringBuilder builder = new StringBuilder();
        while (!queue.isEmpty()) {
            builder.append(queue.poll());
        }
        return builder.toString();
    }
}
