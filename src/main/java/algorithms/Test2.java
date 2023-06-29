package algorithms;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test2 {
    public static Map<Integer, Integer> calculateRepeats(List<Integer> integerList) {
        if (integerList == null) {
            throw new IllegalArgumentException("List must not be null");
        }
        Map<Integer, Integer> result = new HashMap<>();
        for (int i : integerList) {
            result.merge(i, 1, Integer::sum);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(-11));
    }
}
