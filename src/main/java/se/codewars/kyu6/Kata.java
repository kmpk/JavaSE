package se.codewars.kyu6;

import java.util.Arrays;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        if (numbers.length != 10) throw new IllegalArgumentException();
        for (int i : numbers) {
            if (i > 9 || i < 0) throw new IllegalArgumentException();
        }
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    public static int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (getLeftSum(arr, i) == getRightSum(arr, i)) return i;
        }
        return -1;
    }

    private static int getLeftSum(int[] arr, int offset) {
        if (offset == 0) return 0;
        int result = 0;
        for (int i = offset - 1; i > -1; i--) {
            result += arr[i];
        }
        return result;
    }

    private static int getRightSum(int[] arr, int offset) {
        if (offset == arr.length - 1) return 0;
        int result = 0;
        for (int i = offset + 1; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    public static int[] DataReverse(int[] data) {
        int[] result = new int[data.length];
        for (int i = data.length / 8; i > 0; i--) {
            for (int j = 0; j < 8; j++) {
                result[j + (data.length / 8 - i) * 8] = data[i * 8 - 8 + j];
            }
        }
        return result;
    }

    public static int[] sortArray(int[] array) {
        if (array.length == 0) return array;
        int[] temp = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                temp[i] = array[i];

            }
        }
        Arrays.sort(temp);
        int indexer = 0;
        for (int k = 0; k < temp.length; k++) {
            if (temp[k] != 0) {
                indexer = k;
                break;
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) {
                array[j] = temp[indexer];
                indexer++;
            }
        }
        return array;
    }
}
