package leetcode.pc;

//https://leetcode.com/problems/binary-search/
public class BinarySearch {
    public int search(int[] nums, int target) {
        int result = -1;
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                result = middle;
                break;
            } else {
                if (target < nums[middle]) {
                    right = middle;
                } else {
                    left = middle + 1;
                }
            }
        }
        return result;
    }
}
