package codewars.kyu5;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.LongStream;

public class SumSquaredDivisors {
    private static Collection<Long> getDivisors(long l) {
        HashSet<Long> result = new HashSet<>();
        for (long i = 1; i <= Math.sqrt(l); i++) {
            if (l % i == 0) {
                result.add(i);
                result.add(l / i);
            }
        }
        return result;
    }

    private static long squareAndSum(Collection<Long> divisors) {
        return divisors.stream().map(l -> l * l).reduce(Long::sum).orElse(0L);
    }

    private static boolean isSquare(long l) {
        return Math.sqrt(l) % 1 == 0;
    }

    public static String listSquared(long m, long n) {
        StringBuilder sb = new StringBuilder().append("[");
        LongStream.rangeClosed(m, n).forEach(l -> {
            long sumOfSquaredDivisors = squareAndSum(getDivisors(l));
            if (isSquare(sumOfSquaredDivisors)) {
                sb.append("[").append(l).append(", ").append(sumOfSquaredDivisors).append("], ");
            }
        });
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length()-1).deleteCharAt(sb.length()-1);
        }
        sb.append("]");
        return sb.toString();
    }
}
