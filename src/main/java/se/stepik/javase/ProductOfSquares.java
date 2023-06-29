package se.stepik.javase;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(1, 3).boxed().collect(Collectors.toList());
        long val = numbers.stream().map(i -> (long) i).reduce(1L, (l1, l2) -> (l1 *= l2 * l2));
        System.out.println(val);
    }
}
/*
 *     R result = supplier.get();
 *     for (T element : this stream)
 *         accumulator.accept(result, element);
 *     return result;
 */