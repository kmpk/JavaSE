package leetcode;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int maxCounter = 0;
        int currentCounter = 0;

        for (int i : nums) {
            if (set.contains(i - 1)) {
                continue;
            }
            for (int j = i; j <= i + set.size() + 1; j++) {
                if (set.contains(j)) {
                    currentCounter++;
                } else {
                    maxCounter = Math.max(currentCounter, maxCounter);
                    currentCounter = 0;
                    break;
                }
            }
            if (maxCounter > set.size()) {
                break;
            }
        }
        maxCounter = Math.max(currentCounter, maxCounter);
        return maxCounter;
    }
}
