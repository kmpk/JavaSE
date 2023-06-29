package se.stepik.javase;

import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int current = sc.nextInt();
            int sum = 0;
            double counter = 0;
            while (current != 0) {
                counter++;
                sum += current;
                current = sc.nextInt();
            }
            System.out.println(sum / counter);
        }
    }
}
