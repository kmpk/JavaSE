package leetcode;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        int numIndex = 0;
        while (numIndex != -1 && zeroIndex != -1) {
            if (zeroIndex < numIndex) {
                swap(nums, zeroIndex, numIndex);
            } else {
                numIndex++;
            }
            zeroIndex = findFirstZero(nums, zeroIndex);
            numIndex = findFirstNum(nums, numIndex);
        }
    }

    private int findFirstNum(int[] array, int from) {
        for (int i = from; i < array.length; i++) {
            if (array[i] != 0) {
                return i;
            }
        }
        return -1;
    }

    private int findFirstZero(int[] array, int from) {
        for (int i = from; i < array.length; i++) {
            if (array[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
