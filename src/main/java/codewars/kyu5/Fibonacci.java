package codewars.kyu5;

import java.util.stream.IntStream;

public class Fibonacci {
    public static IntStream generateFibonacciSequence() {
        int[] pair = {0, 1};
        return IntStream.range(0, Integer.MAX_VALUE).peek(i -> {
            int temp = pair[0] + pair[1];
            pair[0] = pair[1];
            pair[1] = temp;
        }).map(i -> pair[0]);

        //return Stream.iterate(new int[]{1, 1}, currentPair -> new int[]{currentPair[1], currentPair[0] + currentPair[1]}).mapToInt(currentPair -> currentPair[0]);

    }
}
