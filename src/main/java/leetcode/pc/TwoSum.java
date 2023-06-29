package leetcode.pc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        String s = Arrays.toString(new TwoSum().twoSum(new int[]{3,15,2,6,7}, 10));
        System.out.println(s);
    }

    public int[] twoSum(int[] nums, int target) {
        Set<Integer> neededToSum = new HashSet<>();
        for (int i : nums) {
            if (neededToSum.contains(i)) {
                return new int[]{i, target - i};
            }
            neededToSum.add(target - i);
        }
        return null;
    }

//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }
}
