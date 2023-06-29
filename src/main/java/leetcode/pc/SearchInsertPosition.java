package leetcode.pc;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int middle = 0;
        while (left < right) {
            middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                break;
            } else {
                if (target < nums[middle]) {
                    right = middle;
                } else {
                    left = middle + 1;
                }
            }
        }
        return nums[middle] == target ? middle : left;
    }
}
