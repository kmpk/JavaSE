package se.stepik.javase;

import java.util.Scanner;

public class RecLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(addInt(0,scanner));
        scanner.close();
    }

    private static int addInt(int current, Scanner scanner) {
        int i = scanner.nextInt();
        if (i == 0) {
            return i + current;
        } else {
            return addInt(i + current, scanner);
        }
    }
}
