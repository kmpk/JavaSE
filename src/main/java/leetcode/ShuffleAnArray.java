package leetcode;

import java.util.concurrent.ThreadLocalRandom;

public class ShuffleAnArray {
    private final int[] original;
    private final ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();

    public ShuffleAnArray(int[] nums) {
        this.original = nums;
    }

    public int[] reset() {
        return original;
    }

    public int[] shuffle() {
        int[] result = original.clone();
        int length = original.length;
        for (int i = 0; i < length; i++) {
            int nextRandomIndex = threadLocalRandom.nextInt(length);
            swap(result, i, nextRandomIndex);
        }
        return result;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
