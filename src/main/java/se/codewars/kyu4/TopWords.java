package se.codewars.kyu4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopWords {
    public static List<String> top3(String s) {
        Map<String, Long> map = Arrays.stream(s.split("[ ,.!:;\\/|\\-_?*]+"))
                .filter(s1 -> s1.length() > 0 && !s1.matches("[']+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println();;
        return map.entrySet().stream().sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        /*
        return Arrays.stream(s.split("[ ,.!:\\/|\\-_?*]+"))
                .filter(s1 -> s1.length() > 0 && !s1.matches("[']+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
         */
    }
}

