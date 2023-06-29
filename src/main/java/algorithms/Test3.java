package algorithms;

import java.math.BigInteger;
import java.util.concurrent.CompletableFuture;
import java.util.stream.LongStream;

public class Test3 {
    public static void main(String[] args) {
        long l = 1000000L;

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync(() -> getFactorial(l)).thenRun(() -> System.out.println("first done!"));
        CompletableFuture<Void> voidCompletableFuture1 = CompletableFuture.supplyAsync(() -> getFactorialStream(l)).thenRun(() -> System.out.println("second done!"));
        CompletableFuture.allOf(voidCompletableFuture, voidCompletableFuture1).join();
    }

    private static BigInteger getFactorialStream(long l) {
        if (l < 2) {
            return BigInteger.ONE;
        }
        return LongStream.range(1, l + 1).parallel().mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).orElseThrow();

    }

    private static BigInteger getFactorial(long l) {
        if (l < 2) {
            return BigInteger.ONE;
        }
        BigInteger accumulator = BigInteger.ONE;
        for (long i = 1; i <= l; i++) {
            accumulator = accumulator.multiply(BigInteger.valueOf(i));
        }
        return accumulator;
    }
}
