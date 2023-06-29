package se.codewars.kyu5;

import java.util.Iterator;
import java.util.stream.LongStream;

public class ProdFib {
    public static long[] productFib(long prod) {
        Iterator<Long> fibonacciIterator = fibonacciStream().iterator();
        boolean found = false;
        long previous = 0;
        long current = 0;
        while (!found) {
            previous = current;
            current = fibonacciIterator.next();
            if (previous * current >= prod) {
                found = true;
            }
        }
        return new long[]{previous, current, previous * current == prod ? 1 : 0};
    }

    //from other kata, unchanged
    private static LongStream fibonacciStream() {
        long[] pair = {0, 1};
        return LongStream.range(0, Long.MAX_VALUE).peek(l -> {
            long temp = pair[0] + pair[1];
            pair[0] = pair[1];
            pair[1] = temp;
        }).map(l -> pair[0]);
    }
}
