package se.stepik.javase;

import java.util.Scanner;

public class LargestOfSequence {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int input = sc.nextInt();
            int max = Integer.MIN_VALUE;
            while (input != 0) {
                if (input > max) {
                    max = input;
                }
                input = sc.nextInt();
            }
            System.out.println(max);
        }
    }
}
