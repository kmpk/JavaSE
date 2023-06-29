package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    /*
    ["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
[[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
    */

    @Test
    void name() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.top();
        stack.pop();
        stack.getMin();
        stack.pop();
        stack.getMin();
        stack.pop();
        stack.push(1);
        stack.top();
        stack.getMin();
        stack.push(1);
        stack.top();
        stack.getMin();
        stack.pop();
        stack.getMin();
    }
}