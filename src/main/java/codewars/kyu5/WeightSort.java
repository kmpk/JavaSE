package codewars.kyu5;

import java.util.Arrays;

public class WeightSort {
    public static String orderWeight(String string) {
        String[] array = string.split(" ");
        Arrays.sort(array, (s1, s2) -> {
            long w1 = getWeight(Long.parseLong(s1));
            long w2 = getWeight(Long.parseLong(s2));
            if (w1 == w2) {
                return s1.compareTo(s2);
            } else return (int) (w1 - w2);
        });
        StringBuilder result = new StringBuilder();
        Arrays.stream(array).forEach(s -> result.append(s).append(" "));
        return result.deleteCharAt(result.length() - 1).toString();
    }

    private static long getWeight(long i) {
        int result = 0;
        while (i > 0) {
            result += i % 10;
            i /= 10;
        }
        return result;
    }
}
