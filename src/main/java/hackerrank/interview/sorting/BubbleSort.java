package hackerrank.interview.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            int[] a = new int[n];

            String[] aItems = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }

            int swaps = countSwaps(a);
            int last = a[a.length - 1];
            int first = a[0];

            System.out.printf("Array is sorted in %d swaps.\n", swaps);
            System.out.println("First Element: " + first);
            System.out.println("Last Element: " + last);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int countSwaps(int[] arr) {
        int count = 0;
        int bound = arr.length;
        boolean flag;
        for (int i = 0; i < bound - 1; i++) {
            flag = false;
            for (int j = 0; j < bound - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    count++;
                    flag = true;
                }
            }
            if (!flag) break;
        }
        return count;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
