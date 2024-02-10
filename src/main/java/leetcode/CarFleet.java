package leetcode;

import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        SortedMap<Integer, Integer> cars = new TreeMap<>();
        for (int i = 0; i < position.length; i++) {
            cars.put(position[i], speed[i]);
        }

        double[] arrivalTimes = cars.entrySet().stream()
                .mapToDouble(e -> ((double) target - e.getKey()) / e.getValue())
                .toArray();

        Stack<Double> stack = new Stack<>();
        for (double arrivalTime : arrivalTimes) {
            while (!stack.isEmpty() && stack.peek() <= arrivalTime) {
                stack.pop();
            }
            stack.push(arrivalTime);
        }

        return stack.size();
    }
}
