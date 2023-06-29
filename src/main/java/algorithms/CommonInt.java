package algorithms;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommonInt {
    public static void main(String[] args) {
        System.out.println(common(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1)));
    }

    private static int common(List<Integer> integers) {
        return integers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.<Map.Entry<Integer, Long>>comparingLong(Map.Entry::getValue).thenComparingInt(Map.Entry::getKey))
                .orElseThrow().getKey();
    }
}
