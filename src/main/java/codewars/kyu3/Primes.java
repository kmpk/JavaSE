package codewars.kyu3;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Primes {
    public static IntStream stream() {
        LinkedList<Integer> primes = new LinkedList<>();
        return IntStream.rangeClosed(2, Integer.MAX_VALUE).filter(i -> (!isDividableByKnownPrimes(primes, i)))
                .filter(i -> BigInteger.valueOf(i).isProbablePrime(5)).peek(primes::add);
    }

    private static boolean isDividableByKnownPrimes(List<Integer> set, int candidate) {
        for (int i : set) {
            if (candidate % i == 0) return true;
        }
        return false;
    }
}