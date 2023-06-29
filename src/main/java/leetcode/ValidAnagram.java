package leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
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
