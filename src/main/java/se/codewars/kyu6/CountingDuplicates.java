package se.codewars.kyu6;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Map<Integer, Integer> charMap = new HashMap<>();
        text.toLowerCase().chars().forEach(i -> charMap.merge(i, 1, Integer::sum));
        return (int) charMap.values().stream().filter(integer -> integer > 1).count();
    }
}
