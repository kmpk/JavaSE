package leetcode;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        System.arraycopy(rotateArray(nums, k), 0, nums, 0, nums.length);
    }

    private int[] rotateArray(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < temp.length; i++) {
            int num = nums[i];
            int newIndex = (i + k) % nums.length;
            temp[newIndex] = num;
        }
        return temp;
    }
}
