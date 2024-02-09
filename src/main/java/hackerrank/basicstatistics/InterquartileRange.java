package hackerrank.basicstatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class InterquartileRange {
    public static void main(String... args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            bufferedReader.readLine(); //ignore first input
            String[] stringArray = bufferedReader.readLine().split(" ");
            int[] elements = new int[stringArray.length];
            for (int i = 0; i < elements.length; i++) {
                elements[i] = Integer.parseInt(stringArray[i]);
            }
            stringArray = bufferedReader.readLine().split(" ");
            int[] frequency = new int[stringArray.length];
            for (int i = 0; i < frequency.length; i++) {
                frequency[i] = Integer.parseInt(stringArray[i]);
            }
            NumberFormat formatter = new DecimalFormat("#0.0");
            int[] array = buildArray(elements, frequency);
            Arrays.sort(array);
            System.out.println(formatter.format(calculateQ3(array) - calculateQ1(array)));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] buildArray(int[] elements, int[] frequency) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < frequency.length; i++) {
            int current = elements[i];
            int currentFreq = frequency[i];
            for (int j = 0; j < currentFreq; j++) {
                resultList.add(current);
            }
        }
        return resultList.stream().mapToInt(i -> i).toArray();
    }

    private static int calculateQ1(int[] array) {
        return calculateQ2(Arrays.copyOfRange(array, 0, array.length / 2));
    }

    private static int calculateQ2(int[] array) {
        int result;
        int middlePos = array.length / 2 - 1;
        if (array.length % 2 == 0) {
            result = (array[middlePos] + array[middlePos + 1]) / 2;
        } else {
            result = array[middlePos + 1];
        }
        return result;
    }

    private static int calculateQ3(int[] array) {
        if (array.length % 2 == 0) {
            return calculateQ2(Arrays.copyOfRange(array, array.length / 2, array.length));
        } else return calculateQ2(Arrays.copyOfRange(array, array.length / 2 + 1, array.length));
    }
}
