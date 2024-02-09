package hackerrank.basicstatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

public class stDeviation {
    public static void main(String... args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            bufferedReader.readLine(); //ignore first input
            String[] stringArray = bufferedReader.readLine().split(" ");
            int[] array = new int[stringArray.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(stringArray[i]);
            }
            NumberFormat formatter = new DecimalFormat("#0.0");
            System.out.println(formatter.format(calculateStDeviation(array)));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double calculateMean(int[] array) {
        return Arrays.stream(array).mapToDouble(i -> i).sum() / array.length;
    }

    private static double calculateStDeviation(int[] array) {
        double mean = calculateMean(array);
        double result = 0;
        for (int i : array) {
            result += (i - mean) * (i - mean);
        }
        return Math.sqrt(result / array.length);
    }
}
