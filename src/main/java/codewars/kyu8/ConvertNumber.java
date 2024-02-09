package codewars.kyu8;

public class ConvertNumber {
    public static int[] digitize(long n) {
        char[] digits = Long.toString(n).toCharArray();
        int[] result = new int[digits.length];
        for (int i = 0; i < result.length; i++) {
            result[result.length - i - 1] = Character.digit(digits[i], 10);
        }
        return result;
    }
}
