package algorithms;

import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(compute(10, 15));
    }

    private static BigInteger compute(long n) {
        if (n <= 0) {
            return BigInteger.ZERO;
        }
        if (n == 1) {
            return BigInteger.ONE;
        }
        BigInteger prev = BigInteger.ONE;
        BigInteger prevPrev = BigInteger.ONE;
        BigInteger current = BigInteger.ONE;

        for (long l = 2; l < n; l++) {
            prevPrev = prev;
            prev = current;
            current = prev.add(prevPrev);
        }
        return current;
    }

    private static String compute(int start, int end) {
        StringBuilder resultBuffer = new StringBuilder();

        BigInteger prevPrev = BigInteger.ZERO;
        BigInteger prev = BigInteger.ONE;
        BigInteger current = BigInteger.ONE;

        if (start == 0) {
            resultBuffer.append(prevPrev).append(" ");
        }
        if (start <= 1) {
            resultBuffer.append(prev).append(" ");
        }
        if (start <= 2) {
            resultBuffer.append(current).append(" ");
        }

        for (long l = 3; l < end; l++) {
            prevPrev = prev;
            prev = current;
            current = prev.add(prevPrev);
            if (l >= start) {
                resultBuffer.append(current).append(" ");
            }
        }
        return resultBuffer.toString().trim();
    }
}
