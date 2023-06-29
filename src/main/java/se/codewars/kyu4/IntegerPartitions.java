package se.codewars.kyu4;

import java.util.*;

public class IntegerPartitions {
    public static String part(int n) {
        int[] parts = products(n);
        Arrays.sort(parts);
        return String.format("Range: %d Average: %.2f Median: %.2f", range(parts), average(parts), median(parts))
                .replaceAll(",", ".");
    }

    private static int[] products(int n) {
        int[] partitions = new int[n];
        int lastPart = 0;
        partitions[lastPart] = n;
        List<int[]> result = new ArrayList<>();
        while (true) {
            int[] current = new int[lastPart + 1];
            System.arraycopy(partitions, 0, current, 0, lastPart + 1);
            result.add(current);
            int remVal = 0;
            while (lastPart >= 0 && partitions[lastPart] == 1) {
                remVal += partitions[lastPart];
                lastPart--;
            }
            if (lastPart < 0) {
                Set<Integer> set = new HashSet<>();
                for (int[] i : result) {
                    set.add(product(i));
                }
                int[] out = new int[set.size()];
                Iterator<Integer> it = set.iterator();
                for (int i = 0; i < set.size(); i++) {
                    out[i] = it.next();
                }
                return out;
            }
            partitions[lastPart]--;
            remVal++;
            while (remVal > partitions[lastPart]) {
                partitions[lastPart + 1] = partitions[lastPart];
                remVal = remVal - partitions[lastPart];
                lastPart++;
            }
            partitions[lastPart + 1] = remVal;
            lastPart++;
        }
    }

    static private int product(int[] array) {
        return Arrays.stream(array)
                .reduce(1, (a, b) -> a * b);
    }

    private static int range(int[] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        return max - min;
    }

    private static double average(int[] array) {
        return Arrays.stream(array)
                .average()
                .orElse(0d);
    }

    private static double median(int[] array) {
        double median;
        if (array.length % 2 == 0)
            median = ((double) array[array.length / 2] + (double) array[array.length / 2 - 1]) / 2;
        else
            median = (double) array[array.length / 2];
        return median;
    }
}
