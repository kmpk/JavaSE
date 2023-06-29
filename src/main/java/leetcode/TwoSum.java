package leetcode;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] sorted = new int[nums.length];
        System.arraycopy(nums, 0, sorted, 0, nums.length);
        Arrays.sort(sorted);
        int currentIndex = 0;
        int secondIndex = -1;
        for (; currentIndex < nums.length; currentIndex++) {
            int currentNum = nums[currentIndex];
            int numToFind = target - currentNum;
            int foundIndexInSorted = Arrays.binarySearch(sorted, numToFind);
            if (foundIndexInSorted >= 0) {
                if (numToFind == currentNum) {
                    if (hasSameNeighbor(sorted, numToFind, foundIndexInSorted)) {
                        secondIndex = findNumIndex(nums, numToFind, true);
                        break;
                    }
                } else {
                    secondIndex = findNumIndex(nums, numToFind, false);
                    break;
                }
            }
        }
        return new int[]{currentIndex, secondIndex};
    }

    private boolean hasSameNeighbor(int[] sorted, int num, int index) {
        boolean hasLeftSameNeighbor = false;
        if (index > 0) {
            hasLeftSameNeighbor = sorted[index - 1] == num;
        }
        boolean hasRightSameNeighbor = false;
        if (index < sorted.length) {
            hasRightSameNeighbor = sorted[index + 1] == num;
        }
        return hasLeftSameNeighbor || hasRightSameNeighbor;
    }

    private int findNumIndex(int[] array, int num, boolean findSecond) {
        boolean findNextFlag = findSecond;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                if (findNextFlag) {
                    findNextFlag = false;
                } else {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
}
