package se.hackerrank.interview.arrays;

import java.io.IOException;
import java.util.Scanner;

public class problem2 {
    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        d = d % a.length;
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int newPos;
            if (i - d < 0) newPos = i - d + a.length;
            else newPos = i - d;
            result[newPos] = a[i];
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i : result) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(" ")));

        scanner.close();
    }
}
