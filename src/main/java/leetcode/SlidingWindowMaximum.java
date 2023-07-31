package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            map.merge(nums[i], 1, Integer::sum);
        }
        list.add(map.firstKey());
        for (int i = k; i < nums.length; i++) {
            int toRemove = nums[i - k];
            if (!map.remove(toRemove, 1)) {
                map.put(toRemove, map.get(toRemove) - 1);
            }
            map.merge(nums[i], 1, Integer::sum);
            list.add(map.firstKey());
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
