package se.codewars.kyu6;

import java.util.Arrays;

public class Sol {
    //best on codewars
    public static int solveSuperMarketQueue2(int[] customers, int n) {
        int[] result = new int[n];
        for(int i = 0; i < customers.length; i++){
            result[0] += customers[i];
            Arrays.sort(result);
        }
        return result[n-1];
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        if (customers.length == 0 || n == 0) return 0;
        int time = 0;
        int[] checkouts = new int[n];
        for (int i = 0; i < customers.length; i++) {
            int emptyCheckoutIndex = getZeroArrayIndex(checkouts);
            if (emptyCheckoutIndex != -1) {
                checkouts[emptyCheckoutIndex] = customers[i];
            } else {
                int nextToGo = getArrayMin(checkouts);
                time += nextToGo;
                reduceArrayElements(nextToGo,checkouts);
                i--;
            }
        }
        return time + getArrayMax(checkouts);
    }

    private static void reduceArrayElements(int n, int[] array){
        for (int j = 0; j < array.length; j++) {
            array[j] -= n;
        }
    }

    private static int getZeroArrayIndex(int[] array) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] == 0) return j;
        }
        return -1;
    }

    private static int getArrayMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    private static int getArrayMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

}