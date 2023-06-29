package se.stepik.javase;

import java.util.Arrays;
import java.util.Scanner;

public class RowsSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        String[] input = sc.nextLine().split(" ");
        i = Integer.parseInt(input[0]);
        j = Integer.parseInt(input[1]);
        int[][] array = new int[i][j];
        for (int k = 0; k < i; k++) {
            array[k] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        input = sc.nextLine().split(" ");
        i = Integer.parseInt(input[0]);
        j = Integer.parseInt(input[1]);
        swapRows(i, j, array);
        System.out.println(arrayToString(array));
    }

    private static String arrayToString(int[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    private static void swapRows(int i, int j, int[][] array) {
        int temp;
        for (int k = 0; k < array.length; k++) {
            temp = array[k][j];
            array[k][j] = array[k][i];
            array[k][i] = temp;
        }
    }
}
