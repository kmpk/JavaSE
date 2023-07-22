package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
//        Using sort
//        Arrays.sort(nums);
//        return nums[nums.length - k];
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : nums) {
            queue.add(i);
        }
        for (int i = 1; i < k; i++) {
            queue.poll();
        }
        return queue.poll();
    }
}
