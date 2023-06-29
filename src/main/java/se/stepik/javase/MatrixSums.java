package se.stepik.javase;

import java.util.Scanner;

public class MatrixSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        String[] input = sc.nextLine().split(" ");
        i = Integer.parseInt(input[0]);
        j = Integer.parseInt(input[1]);
        int[][] array = new int[i][j];
        for (int i1 = 0; i1 < i; i1++) {
            input = sc.nextLine().split(" ");
            for (int j1 = 0; j1 < j; j1++) {
                array[i1][j1] = Integer.parseInt(input[j1]);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int ii = 0; ii < i; ii++) {
            for (int jj = 0; jj < j; jj++) {
                for (int iii = ii; iii < i; iii++) {
                    for (int jjj = jj; jjj < j; jjj++) {
                        int current = subArraySum(array, ii, jj, iii, jjj);
                        if (current > max) max = current;
                    }
                }
            }
        }
        System.out.println(max);

    }

    private static int subArraySum(int[][] array, int i, int j, int i1, int j1) {
        int sum = 0;
        for (int ii = i; ii <= i1; ii++) {
            for (int jj = j; jj <= j1; jj++) {
                sum += array[ii][jj];
            }
        }
        return sum;
    }
}
