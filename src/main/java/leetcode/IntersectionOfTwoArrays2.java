package leetcode;

import java.util.*;

public class IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> count = new HashMap<>();
        int[] smallerArray = nums1.length < nums2.length ? nums1 : nums2;
        int[] biggerArray = smallerArray == nums1 ? nums2 : nums1;
        Arrays.stream(smallerArray)
                .forEach(i -> count.merge(i, 1, Integer::sum));
        List<Integer> resultList = new ArrayList<>();
        for (int i : biggerArray) {
            Integer intCount = count.getOrDefault(i, 0);
            if (intCount > 0) {
                resultList.add(i);
                count.merge(i, -1, Integer::sum);
            }
        }
        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
