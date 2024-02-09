package hackerrank.interview.arrays;

import java.io.*;
import java.util.Scanner;

public class problem1 {
    // Complete the hourglassSum function below.
    private static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int current;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                current = calculateHourglass(i, j, arr);
                if (current > max) max = current;
            }
        }
        return max;
    }

    private static int calculateHourglass(int i, int j, int[][] array) {
        int hourglass = 0;
        hourglass += array[i][j] + array[i][j + 1] + array[i][j + 2];
        hourglass += array[i + 1][j + 1];
        hourglass += array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
        return hourglass;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        /*
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        */
        System.out.println(result);
        scanner.close();
    }
}
