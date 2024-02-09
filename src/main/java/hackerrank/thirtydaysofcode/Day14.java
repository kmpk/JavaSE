package hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
    private int[] elements;
    int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : elements) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        maximumDifference = max - min;
    }
}
