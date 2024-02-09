package codewars.kyu6;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        char[] charArray = Integer.toString(num).toCharArray();
        Arrays.sort(charArray);
        StringBuilder sb = new StringBuilder(new String(charArray));
        return Integer.parseInt(sb.reverse().toString());
    }
}
