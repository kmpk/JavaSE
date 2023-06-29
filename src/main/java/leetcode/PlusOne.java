package leetcode;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        boolean isOverFlowed;
        int currentRank = digits.length - 1;
        do {
            digits[currentRank]++;
            isOverFlowed = false;
            if (digits[currentRank] == 10) {
                digits[currentRank] = 0;
                isOverFlowed = true;
            }
            currentRank--;
        } while (isOverFlowed && currentRank != -1);

        if (isOverFlowed) {
            int[] newArray = new int[digits.length + 1];
            System.arraycopy(digits, 0, newArray, 1, digits.length);
            newArray[0] = 1;
            return newArray;
        } else {
            return digits;
        }
    }
}
