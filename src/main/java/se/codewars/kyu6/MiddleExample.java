package se.codewars.kyu6;

public class MiddleExample {
    public static String getMiddle(String word) {
        if (word == null) throw new IllegalArgumentException();
        String formattedWord = word.replace("\0", "");
        if (formattedWord.length() % 2 != 0) {
            return formattedWord.substring(formattedWord.length() / 2, formattedWord.length() / 2+1);
        } else {
            return formattedWord.substring(formattedWord.length() / 2 - 1, formattedWord.length() / 2 + 1);
        }
    }
}
