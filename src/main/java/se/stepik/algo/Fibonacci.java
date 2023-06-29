package se.stepik.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String... args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            System.out.println(lastDigitArraySumAlgo(n));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static long arraySumAlgo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        long[] array = new long[n+1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < n+1; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

    private static int lastDigitArraySumAlgo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int[] array = new int[n+1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < n+1; i++) {
            array[i] = (array[i - 1] + array[i - 2])%10;
        }
        return array[n];
    }
}
