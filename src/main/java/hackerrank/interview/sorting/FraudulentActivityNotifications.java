package hackerrank.interview.sorting;

import java.io.*;
import java.util.Arrays;

public class FraudulentActivityNotifications {
    public static void main(String[] args) {
        try (BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in))) {

            String[] nd = scanner.readLine().split(" ");

            int n = Integer.parseInt(nd[0]);

            int d = Integer.parseInt(nd[1]);

            int[] expenditure = new int[n];

            String[] expenditureItems = scanner.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                int expenditureItem = Integer.parseInt(expenditureItems[i]);
                expenditure[i] = expenditureItem;
            }

            int result = activityNotifications(expenditure, d);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static int activityNotifications(int[] expenditure, int d) {
        int result = 0;
        for (int i = d; i < expenditure.length; i++) {
            double median = calculateMedian(Arrays.copyOfRange(expenditure, i - d, i));
            if (expenditure[i] >= median * 2) {
                result++;
            }
        }
        return result;
    }

    private static double calculateMedian(int[] array) {
        Arrays.sort(array);
        double result;
        if (array.length % 2 == 0) {
            int middlePos = array.length / 2 - 1;
            result = (double) (array[middlePos] + array[middlePos + 1]) / 2;
        } else {
            int middlePos = array.length / 2;
            result = (double) array[middlePos];
        }
        return result;
    }
}
