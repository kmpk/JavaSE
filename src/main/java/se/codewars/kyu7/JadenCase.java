package se.codewars.kyu7;

import java.util.Arrays;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase==null || phrase.isEmpty()) return null;
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(phrase.split(" ")).map(JadenCase::capitalizeFirstLetter).forEach(s-> stringBuilder.append(s).append(" "));
        return stringBuilder.toString().trim();
    }
    private static String capitalizeFirstLetter(String s){
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
