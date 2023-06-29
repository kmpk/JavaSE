package se.stepik.javase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = Arrays.stream(reader.readLine().split(" ")).collect(Collectors.toList());
        List result = list.stream().filter(s -> s.startsWith("J")).map(s -> s.substring(1)).collect(Collectors.toList());
        Collections.reverse(result);
        result.forEach(System.out::println);
        //enter your code here
    }

    @FunctionalInterface
    public interface TernaryIntPredicate {
        // Write a method here
        boolean test(int a, int b, int c);
    }

    public static final TernaryIntPredicate allValuesAreDifferentPredicate = (a, b, c) -> a != b && b != c && a != c;// Write a lambda expression here

    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        return new IntPredicate() {
            @Override
            public boolean test(int value) {
                boolean result = false;
                for (IntPredicate ip : predicates) {
                    result |= ip.test(value);
                }
                return result;
            }
        };
    }

    public static List<String> noLongString(List<String> strings) {
        return strings.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
    }

    public static NavigableMap<Integer, String> getSubMap(NavigableMap<Integer, String> map) {
        NavigableMap<Integer, String> result;
        int firstKey = map.firstKey();
        int lastKey = map.lastKey();
        if (firstKey % 2 != 0) {
            result = map.subMap(firstKey, true, firstKey + 4, true);
        } else {
            result = map.subMap(lastKey - 4, true, lastKey, true);
        }
        return result.descendingMap();
    }

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        SortedMap<String, Integer> map = new TreeMap<>();
        for (String s : strings) {
            map.merge(s, 1, Integer::sum);
        }
        return map;
    }

    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s : %d\n", entry.getKey(), entry.getValue());
        }
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }


    public static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
        TreeSet<Integer> resultSet = new TreeSet<>(Collections.reverseOrder());
        resultSet.add(Collections.max(set1));
        resultSet.add(Collections.max(set2));
        resultSet.add(Collections.max(set3));
        return resultSet;
    }

    public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        set1.stream().filter(i -> !set2.contains(i)).forEach(result::add);
        set2.stream().filter(i -> !set1.contains(i)).forEach(result::add);
        return result;
    }

    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set) {
        set.removeIf(integer -> integer > 10);
        return set;
    }

    public static List<Integer> getList() {
        return Collections.EMPTY_LIST;
    }
}

class Pair<T, V> {
    T first;
    V second;

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    private Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <T, V> Pair of(T first, V second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(getFirst(), pair.getFirst()) &&
                Objects.equals(getSecond(), pair.getSecond());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirst(), getSecond());
    }
}