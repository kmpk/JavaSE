package leetcode;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int counter = 1;
        int current = 0;
        for (int i = 1; i < nums.length; i++) {
            int currentNumber = nums[current];
            if (currentNumber != nums[i]) {
                current++;
                nums[current] = nums[i];
                counter++;
            }
        }
        return counter;
    }
}
