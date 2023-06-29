package leetcode;

import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        for (int i = 0, j = s1.length(); j <= s2.length(); i++, j = i + s1.length()) {
            String substring = s2.substring(i, j);
            if (isAnagram(s1, substring)) {
                return true;
            }
        }
        return false;
    }

    private boolean isAnagram(String s, String t) {
        return Arrays.equals(fillLettersArray(s), fillLettersArray(t));
    }

    private int[] fillLettersArray(String s) {
        int[] letters = new int[26];
        for (char c : s.toCharArray()) {
            letters[getLetterIndex(c)]++;
        }
        return letters;
    }

    private int getLetterIndex(char c) {
        return c - 97;
    }
}
