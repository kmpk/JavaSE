package codewars.kyu4;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.LongStream;

public class BitCount {
    private static AtomicReference<BigInteger> counter = new AtomicReference<>(BigInteger.ZERO);
    private static int[] lookupTable;

    public static BigInteger countOnes(long left, long right) {
        counter.set(BigInteger.ZERO);
        lookupTable = populateLookupTable();
        LongStream.rangeClosed(left, right).parallel().forEach(BitCount::countOnes);
        return counter.get();
    }

    private static int[] populateLookupTable() {
        lookupTable = new int[65536];
        for (int i = 0; i < lookupTable.length; i++) {
            lookupTable[i] = Integer.bitCount(i);
        }
        return lookupTable;
    }

    private static void countOnes(long num) {
        final long count = lookupTable[(int) (num & 0xffff)]
                + lookupTable[(int) (num >> 16 & 0xffff)]
                + lookupTable[(int) (num >> 32 & 0xffff)]
                + lookupTable[(int) (num >> 48 & 0xffff)];
        System.out.println("num : " + num + " bits : " + count);
        counter.updateAndGet(l -> l.add(BigInteger.valueOf(count)));
    }
}
