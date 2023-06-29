package leetcode;

import java.util.Stack;

public class MinStack {
    private Stack<Node> stack = new Stack<>();
    private int minValue = Integer.MAX_VALUE;

    public void push(int val) {
        minValue = Math.min(val, minValue);
        stack.push(new Node(val, minValue));
    }

    public void pop() {
        stack.pop();
        if (stack.isEmpty()) {
            minValue = Integer.MAX_VALUE;
        } else {
            minValue = stack.peek().minimum;
        }
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return minValue;
    }

    private class Node {
        int value;
        int minimum;

        Node(int value, int minimum) {
            this.value = value;
            this.minimum = minimum;
        }
    }
}
