package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int result = nums.length;
        Deque<Integer> stack = new LinkedList<>();
        for (int i : nums) {
            if (i == val) {
                result--;
            } else {
                stack.push(i);
            }
        }
        int index = 0;
        while (!stack.isEmpty()) {
            nums[index] = stack.pop();
            index++;
        }
        return result;
    }
}
