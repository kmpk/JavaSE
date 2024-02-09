package codewars.kyu7;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Testing123 {
    public static List<String> number(List<String> lines) {
        AtomicInteger counter = new AtomicInteger(1);
        return lines.stream().map(s -> counter.getAndIncrement() + ": " + s).collect(Collectors.toList());
    }
}
