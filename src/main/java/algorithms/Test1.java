package algorithms;

public class Test1 {
    public static String longestPrefix(String[] strs) {
        if (strs == null) {
            throw new IllegalArgumentException();
        }
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String first = strs[0];
        int max = Integer.MAX_VALUE;
        for (int i = 1; i < strs.length; i++) {
            max = Math.min(max, samePrefixLength(first, strs[i]));
            if (max == 0) {
                break;
            }
        }
        return first.substring(0, max);
    }

    private static int samePrefixLength(String first, String second) {
        String smallString = first.length() <= second.length() ? first : second;
        String bigString = second.length() >= first.length() ? second : first;
        int length = 0;
        for (int i = 0; i < smallString.length(); i++) {
            if (smallString.charAt(i) == bigString.charAt(i)) {
                length++;
            } else {
                break;
            }
        }
        return length;
    }
}
