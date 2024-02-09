package hackerrank.interview.arrays;

import java.io.IOException;
import java.util.Scanner;

public class problem3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        makeCorrectArray(arr);

        System.out.println(minimumSwaps(arr));

        scanner.close();
    }

    private static void makeCorrectArray(int[] arr) {
        boolean hasChanges = true;
        while (hasChanges) {
            hasChanges = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr.length) {
                    arr[i] -= 1;
                    hasChanges = true;
                }
            }
        }
    }

    private static int minimumSwaps(int[] arr) {
        int numSwaps = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int currentValue = arr[i];
            while (currentValue != i + 1) {
                int temp = arr[currentValue - 1];
                arr[currentValue - 1] = currentValue;
                currentValue = temp;
                numSwaps++;
            }
        }
        return numSwaps;
    }
}
