package se.codewars.kyu6;

public class Max {
    public static int sequence(int[] arr) {
        int max = 0;
        int iterationMax = 0;
        for (int i = 0; i < arr.length; i++) {
            iterationMax += arr[i];
            if (max < iterationMax) {
                max = iterationMax;
            }
            if (iterationMax < 0) {
                iterationMax = 0;
            }
        }
        return max;
    }
}
