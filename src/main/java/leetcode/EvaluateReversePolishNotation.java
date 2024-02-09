package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    int second = stack.pollLast();
                    int first = stack.pollLast();
                    stack.addLast(first + second);
                }
                case "-" -> {
                    int second = stack.pollLast();
                    int first = stack.pollLast();
                    stack.addLast(first - second);

                }
                case "/" -> {
                    int second = stack.pollLast();
                    int first = stack.pollLast();
                    stack.addLast(first / second);

                }
                case "*" -> {
                    int second = stack.pollLast();
                    int first = stack.pollLast();
                    stack.addLast(first * second);

                }
                default -> stack.addLast(Integer.parseInt(token));
            }
        }
        return stack.poll();
    }
}
