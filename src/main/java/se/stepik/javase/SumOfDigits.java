package se.stepik.javase;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(getResult(num));
    }

    private static long getResult(int num) {
        long counter = 0;
        int sumOfDigits = sumOfDigits(num);
        for (int i = num-1; i > 0; i--) {
            if (sumOfDigits(i) == sumOfDigits) {
                counter++;
            }
        }
        return counter;
    }

    private static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
