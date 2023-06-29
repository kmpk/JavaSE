package leetcode;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix, target);
    }

    private boolean search(int[][] nums, int target) {
        int result = -1;
        int left = 0;
        int right = nums.length * nums[0].length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            int elementFromMatrix = getElementFromMatrix(nums, middle);
            if (elementFromMatrix == target) {
                result = middle;
                break;
            } else {
                if (target < elementFromMatrix) {
                    right = middle;
                } else {
                    left = middle + 1;
                }
            }
        }
        return result != -1;
    }

    private int getElementFromMatrix(int[][] matrix, int i) {
        int m = i % matrix[0].length;
        int n = i / matrix[0].length;
        return matrix[n][m];
    }
}
