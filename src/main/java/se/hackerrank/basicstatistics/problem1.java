package se.hackerrank.basicstatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

public class problem1 {
    public static void main(String... args) {
        int n;
        int[] array;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(bufferedReader.readLine());
            array = new int[n];
            String[] stringArray = bufferedReader.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(stringArray[i]);
            }
            Arrays.sort(array);
            NumberFormat formatter = new DecimalFormat("#0.0");

            System.out.println(formatter.format(calculateMean(array)));
            System.out.println(formatter.format(calculateMedian(array)));
            System.out.println(calculateMode(array));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double calculateMean(int[] array) {
        return Arrays.stream(array).mapToDouble(i -> i).sum() / array.length;
    }

    private static double calculateMedian(int[] array) {
        double result;
        int middlePos = array.length / 2 - 1;
        if (array.length % 2 == 0) {
            result = (double) (array[middlePos] + array[middlePos + 1]) / 2;
        } else {
            result = (double) array[middlePos];
        }
        return result;
    }

    private static int calculateMode(int[] array) {
        int count = 1;
        int current = array[0];
        int mode = 0;
        int modeCount = 0;

        for (int i = 1; i < array.length; i++) {
            int currentNumber = array[i];
            if (current != currentNumber) {
                if (modeCount < count) {
                    mode = current;
                    modeCount = count;
                }
                count = 1;
                current = currentNumber;
            } else {
                count++;
            }
        }
        return mode;
    }
}
