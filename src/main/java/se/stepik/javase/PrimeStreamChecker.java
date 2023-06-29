package se.stepik.javase;

import java.util.stream.LongStream;

public class PrimeStreamChecker {
    public static boolean isPrime(final long number) {
        return LongStream.range(2, number).parallel().noneMatch(l -> number % l == 0);
    }
}
