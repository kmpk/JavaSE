package hackerrank.interview.arrays;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class problem4 {
    private static long arrayManipulation(int n, int[][] queries) {
        long[] array = new long[n];
        for (int i = 0; i < queries.length; i++) {
            array[queries[i][0] - 1] += queries[i][2];
            if (queries[i][1]!=array.length)
            array[queries[i][1]] -= queries[i][2];
        }
        long currentAdd = 0;
        for (int i = 0; i < array.length; i++) {
            currentAdd += array[i];
            array[i] = currentAdd;
        }
        return Arrays.stream(array).max().orElse(0);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        System.out.println(arrayManipulation(n, queries));


        scanner.close();
    }
}
