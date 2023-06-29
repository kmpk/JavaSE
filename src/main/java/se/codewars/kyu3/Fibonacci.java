package se.codewars.kyu3;

import java.math.BigInteger;

public class Fibonacci {
    public static BigInteger fib(BigInteger z) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        long n = z.longValue();
        int m = 0;
        for (long bit = Long.highestOneBit(n); bit != 0; bit >>>= 1) {

            BigInteger d = multiply(a, b.shiftLeft(1).subtract(a));
            BigInteger e = multiply(a, a).add(multiply(b, b));
            a = d;
            b = e;
            m *= 2;

            if ((n & bit) != 0) {
                BigInteger c = a.add(b);
                a = b;
                b = c;
                m++;
            }
        }
        return a;
    }

    private static BigInteger multiply(BigInteger x, BigInteger y) {
        return x.multiply(y);
    }
}
