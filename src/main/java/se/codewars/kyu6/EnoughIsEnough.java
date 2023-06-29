package se.codewars.kyu6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOcurrences) {
        Map<Integer, Integer> elementsMap = new HashMap<>();
        return Arrays.stream(elements)
                .peek(i -> elementsMap.put(i, elementsMap.getOrDefault(i, 0) + 1))
                .filter(i -> elementsMap.get(i) <= maxOcurrences)
                .toArray();
    }
}
