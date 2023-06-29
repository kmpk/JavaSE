package se.codewars.kyu2;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class PrimeStreaming {
    public static IntStream stream() {
        return IntStream.rangeClosed(2, Integer.MAX_VALUE)
                .filter(i -> BigInteger.valueOf(i).isProbablePrime(4));
    }
}
