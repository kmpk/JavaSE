package leetcode;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomLetters = fillLettersArray(ransomNote);
        int[] magazineLetters = fillLettersArray(magazine);

        for (int i = 0; i < ransomLetters.length; i++) {
            if (ransomLetters[i] > magazineLetters[i]) {
                return false;
            }
        }
        return true;
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
