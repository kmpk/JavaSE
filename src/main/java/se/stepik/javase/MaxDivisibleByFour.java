package se.stepik.javase;

import java.util.Scanner;

public class MaxDivisibleByFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < j; i++) {
            int current = sc.nextInt();
            if (current % 4 == 0 && current > max) max = current;
        }
        System.out.println(max);
        sc.close();
    }
}
