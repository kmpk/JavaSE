package leetcode;

public class RemoveDuplicatesFromSortedArray2 {
    private static final int MARKER = Integer.MIN_VALUE;
    private int counter;

    public int removeDuplicates(int[] nums) {
        counter = nums.length;
        markDuplicates(nums);
        compact(nums);

        return counter;
    }

    private void compact(int[] nums) {
        int pointer = getNextPointer(nums, 0);

        if (pointer==0){
            return;
        }

        for (int i = pointer + 1; i < nums.length; i++) {
            if (nums[i] != MARKER) {
                swap(pointer, i, nums);
                pointer = getNextPointer(nums, pointer);
            }
        }
    }

    private static int getNextPointer(int[] nums, int from) {
        int pointer = 0;

        for (int i = from; i < nums.length; i++) {
            if (nums[i] == MARKER) {
                pointer = i;
                break;
            }
        }
        return pointer;
    }

    private void swap(int x, int y, int[] array) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    private void markDuplicates(int[] nums) {
        int current = MARKER;
        boolean seenDuplicate = false;

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (currentNumber == current) {
                if (seenDuplicate) {
                    markAndCount(i, nums);
                } else {
                    seenDuplicate = true;
                }
            } else {
                current = currentNumber;
                seenDuplicate = false;
            }
        }
    }

    private void markAndCount(int index, int[] array) {
        array[index] = MARKER;
        counter--;
    }
}
