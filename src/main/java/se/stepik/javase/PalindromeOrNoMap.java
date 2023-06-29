package se.stepik.javase;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class PalindromeOrNoMap {
    public static void main(String[] args) {
        int a = args.length;
        String[] words = {"aaaa", "aa", "a", "babs", "lkas"};
        Map<Boolean, List<String>> pal1 = Arrays.stream(words).collect(Collector.of((Supplier<Map<Boolean, List<String>>>) () -> new HashMap<>(), (booleanListMap, s) -> {
            booleanListMap.computeIfAbsent(true, (b) -> new ArrayList<>());
            booleanListMap.computeIfAbsent(false, (b) -> new ArrayList<>());
            StringBuilder sb = new StringBuilder(s);
            boolean isPalindrome = sb.toString().equals(sb.reverse().toString());
            if (isPalindrome) {
                booleanListMap.merge(true, Collections.singletonList(s), (list1, list2) -> {
                    list1.addAll(list2);
                    return list1;
                });
            } else {
                booleanListMap.merge(false, Collections.singletonList(s), (list1, list2) -> {
                    list1.addAll(list2);
                    return list1;
                });
            }
        }, (booleanListMap, booleanListMap2) -> {
            booleanListMap.merge(true, booleanListMap2.get(true), (list1, list2) -> {
                list1.addAll(list2);
                return list1;
            });
            booleanListMap.merge(false, booleanListMap2.get(false), (list1, list2) -> {
                list1.addAll(list2);
                return list1;
            });
            return booleanListMap;
        }, Collector.Characteristics.CONCURRENT));
    }
}
