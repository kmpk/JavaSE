package leetcode;

public class SortColors {
    public void sortColors(int[] nums) {
        int zeroes = 0;
        int ones = 0;
        for (int i : nums) {
            switch (i) {
                case 0 -> zeroes++;
                case 1 -> ones++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (zeroes > 0) {
                zeroes--;
                nums[i] = 0;
            } else if (ones > 0) {
                ones--;
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}
