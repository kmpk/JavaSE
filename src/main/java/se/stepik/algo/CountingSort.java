package se.stepik.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountingSort {
    public static void main(String... args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            bufferedReader.readLine();
            int[] array = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] array2 = CountingSorter.sort(array, 10);
            StringBuilder sb = new StringBuilder();
            Arrays.stream(array2).forEach(i -> sb.append(i).append(' '));
            System.out.println(sb.toString().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class CountingSorter {
    public static int[] sort(int[] array, int limiter) {
        int[] result = new int[array.length];
        int[] count = new int[limiter + 1];
        for (int j = 0; j < array.length; j++) {
            count[array[j]] += 1;
        }
        for (int i = 1; i <= limiter; i++) {
            count[i] += count[i - 1];
        }
        for (int i = array.length - 1; i >= 0; i--) {
            result[count[array[i]] - 1] = array[i];
            count[array[i]] -= 1;
        }
        return result;
    }
}
