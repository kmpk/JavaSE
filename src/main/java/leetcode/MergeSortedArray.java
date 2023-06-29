package leetcode;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(mergeTwoSortedArrays(nums1, m, nums2, n), 0, nums1, 0, nums1.length);
    }

    private int[] mergeTwoSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[nums1.length];
        int pos1 = 0;
        int pos2 = 0;
        for (int i = 0; i < merged.length; i++) {
            int num1;
            int num2;
            if (pos1 < m && pos2 < n) {
                num1 = nums1[pos1];
                num2 = nums2[pos2];
                if (num1 <= num2) {
                    merged[i] = num1;
                    pos1++;
                } else {
                    merged[i] = num2;
                    pos2++;
                }
            } else if (pos1 < m) {
                num1 = nums1[pos1];
                merged[i] = num1;
                pos1++;
            } else if (pos2 < n) {
                num2 = nums2[pos2];
                merged[i] = num2;
                pos2++;
            } else {
                break;
            }
        }
        return merged;
    }
}
