package se.stepik.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergeSortInversions {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            String[] input = br.readLine().split(" ");
            InversionCounter ic = new InversionCounter(Arrays.stream(input).mapToInt(Integer::parseInt).toArray());
            System.out.println(ic.getInversions());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class InversionCounter {
    private long counter = 0;
    private final int[] array;

    public InversionCounter(int[] array) {
        this.array = array;
    }

    public long getInversions() {
        mergeSort(array);
        return counter;
    }

    private int[] mergeSort(int[] arr) {
        if (arr.length < 2) return arr;
        int mid = arr.length / 2;
        return merge(mergeSort(Arrays.copyOfRange(arr, 0, mid)), mergeSort(Arrays.copyOfRange(arr, mid, arr.length)));
    }

    private int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int k = 0;
        int a1 = 0, a2 = 0;
        while (k < merged.length) {
            if (arr1[a1] > arr2[a2]) {
                counter += arr1[a1] == Integer.MAX_VALUE ? 0 : arr1.length - a1;
                merged[k] = arr2[a2];
                k++;
                a2++;
            } else {
                merged[k] = arr1[a1];
                k++;
                a1++;
            }
            if (a1 == arr1.length) {
                a1--;
                arr1[a1] = Integer.MAX_VALUE;
            }
            if (a2 == arr2.length) {
                a2--;
                arr2[a2] = Integer.MAX_VALUE;
            }
        }
        return merged;
    }
}
