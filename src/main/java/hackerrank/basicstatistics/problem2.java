package hackerrank.basicstatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class problem2 {
    public static void main(String... args) {
        int n;
        int[] intArray;
        int[] weightsArray;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(bufferedReader.readLine());
            intArray = new int[n];
            weightsArray = new int[n];
            String[] intStringArray = bufferedReader.readLine().split(" ");
            String[] weightsStringArray = bufferedReader.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                intArray[i] = Integer.parseInt(intStringArray[i]);
                weightsArray[i] = Integer.parseInt(weightsStringArray[i]);
            }
            NumberFormat formatter = new DecimalFormat("#0.0");

            System.out.println(formatter.format(calculateWeightedMean(intArray, weightsArray)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double calculateWeightedMean(int[] ints, int[] weighs) {
        int result = 0;
        int weightSum = 0;
        for (int i = 0; i < ints.length; i++) {
            result += ints[i] * weighs[i];
            weightSum += weighs[i];
        }
        return (double) result / weightSum;
    }
}
