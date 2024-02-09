package codewars.kyu7;

import java.util.Arrays;

public class OddOrEven {
    public static String oddOrEven(int[] array) {
        if (array == null || array.length == 0) return "even";
        return (Arrays.stream(array).sum() % 2 == 0) ? "even" : "odd";
    }
}
