package leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            indexMap.put(nums1[i], i);
        }

        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);

        Deque<Integer> deque = new LinkedList<>();

        for (int i : nums2) {
            while (!deque.isEmpty() && deque.peekLast() < i) {
                Integer i1 = indexMap.get(deque.peekLast());
                if (i1 != null) {
                    result[i1] = i;
                }
                deque.pollLast();
            }
            deque.addLast(i);
        }

        return result;
    }
}
