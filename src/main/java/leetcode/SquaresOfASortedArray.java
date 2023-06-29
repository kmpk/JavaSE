package leetcode;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int resultIndex = nums.length - 1;
        int i = 0;
        int j = nums.length - 1;
        while (j >= i) {
            int leftSquare = nums[i] * nums[i];
            int rightSquare = nums[j] * nums[j];
            if (leftSquare > rightSquare) {
                result[resultIndex] = leftSquare;
                i++;
            } else {
                result[resultIndex] = rightSquare;
                j--;
            }
            resultIndex--;
        }
        return result;
    }
}
