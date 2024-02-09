package codewars.kyu6;

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr == null || strarr.length == 0 || strarr.length < k || k <= 0) return "";
        int maxLength = 0;
        int resultOffset = 0;

        for (int i = 0; i < strarr.length - k+1; i++) {
            int currentLength = getLengthOfWords(k, i, strarr);
            if (currentLength > maxLength) {
                maxLength = currentLength;
                resultOffset = i;
            }
        }
        return buildResultString(k, resultOffset, strarr);
    }

    private static int getLengthOfWords(int k, int offset, String[] strarr) {
        int result = 0;
        for (int i = offset; i < offset + k; i++) {
            result += strarr[i].length();
        }
        return result;
    }

    private static String buildResultString(int k, int offset, String[] strarr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = offset; i < offset + k; i++) {
            stringBuilder.append(strarr[i]);
        }
        return stringBuilder.toString();
    }
}
