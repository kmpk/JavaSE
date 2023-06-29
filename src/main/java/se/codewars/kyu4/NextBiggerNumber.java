package se.codewars.kyu4;

import java.util.Arrays;

public class NextBiggerNumber {
    public static long nextBiggerNumber(long i) {
        char[] digits = buildDigitsArray(i);
        if (digits.length == 1) return -1;
        int pos = 0;
        int replacement = 0;
        boolean found = false;
        for (int j = digits.length - 1; j > 0; j--) {
            if (digits[j - 1] < digits[j]) {
                pos = j - 1;
                found = true;
                replacement = j;
                break;
            }
        }
        if (!found) return -1;
        for (int j = pos; j < digits.length; j++) {
            if (digits[pos] < digits[j] && digits[j] < digits[replacement]) {
                replacement = j;
            }
        }
        swapDigits(pos, replacement, digits);
        Arrays.sort(digits, pos + 1, digits.length);
        return buildLongFromDigitsArray(digits);
    }

    private static void swapDigits(int a, int b, char[] digits) {
        char temp = digits[b];
        digits[b] = digits[a];
        digits[a] = temp;

    }

    private static char[] buildDigitsArray(long l) {
        return String.valueOf(l).toCharArray();
    }

    private static long buildLongFromDigitsArray(char[] digits) {
        long result = 0;
        long mult = 1;
        for (int j = digits.length - 1; j >= 0; j--) {
            result += Character.getNumericValue(digits[j]) * mult;
            mult *= 10;
        }
        return result;
    }
}
