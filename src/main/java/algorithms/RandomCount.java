package algorithms;

import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomCount {
    public static void main(String[] args) {
        Map<Integer, Long> count = IntStream.range(0,Integer.MAX_VALUE).map(i->ThreadLocalRandom.current().nextInt(1000000000)).boxed().parallel().collect(Collectors.groupingByConcurrent(Function.identity(), Collectors.counting()));
        long min = count.entrySet().stream().map(e->e.getValue()).min(Comparator.naturalOrder()).get();
        long max = count.entrySet().stream().map(e->e.getValue()).max(Comparator.naturalOrder()).get();
        System.out.println();
    }
}
