package se.stepik.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BiSearch {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .skip(1)
                    .toArray();
            int[] keys = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .skip(1)
                    .toArray();
            StringBuilder sb = new StringBuilder();
            Arrays.stream(keys)
                    .map(i -> (Searcher.biSearch(array, i)))
                    .forEach(i -> sb.append(i).append(" "));
            System.out.println(sb.toString().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Searcher {
    public static int biSearch(int[] array, int k) {
        int l = 0;
        int r = array.length-1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (array[m] == k) return m+1;
            else if (array[m] > k) r = m - 1;
            else l = m + 1;
        }
        return -1;
    }
}
