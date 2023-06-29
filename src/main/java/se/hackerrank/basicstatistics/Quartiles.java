package se.hackerrank.basicstatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Quartiles {
    public static void main(String... args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            bufferedReader.readLine(); //ignore first input
            String[] stringArray = bufferedReader.readLine().split(" ");
            int[] array = new int[stringArray.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(stringArray[i]);
            }
            Arrays.sort(array);
            System.out.println(calculateQ1(array));
            System.out.println(calculateQ2(array));
            System.out.println(calculateQ3(array));

        } catch (IOException e) {
            e.printStackTrace();
        }
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
