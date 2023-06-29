package se.stepik.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Steps {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.out.println(getResult(arr));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getResult(int[] arr) {
        int[] sums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) sums[i] = arr[i];
            else {
                if (i == 1) sums[i] = Integer.max(arr[i], arr[i] + arr[i - 1]);
                else {
                    int current = arr[i];
                    int pr1 = sums[i - 1] + current;
                    int pr2 = sums[i - 2] + current;
                    sums[i] = pr1 > pr2 ? pr1 : pr2;
                }
            }
        }
        return sums[sums.length - 1];
    }
}
