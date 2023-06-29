package se.hackerrank.interview.greedalgo;

import java.io.*;
import java.util.*;

public class MinAbsDifference {
    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int currentDiff = Math.abs(arr[i] - arr[i + 1]);
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                if (currentDiff == 0) return 0;
            }
        }
        return minDiff;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        System.out.println(minimumAbsoluteDifference(arr));

        scanner.close();
    }
}
