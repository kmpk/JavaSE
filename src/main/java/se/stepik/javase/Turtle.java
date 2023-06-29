package se.stepik.javase;

import java.util.Scanner;

public class Turtle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int j = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < j; i++) {
            String[] input = sc.nextLine().split(" ");
            int distance = Integer.parseInt(input[1]);
            switch (input[0]) {
                case "North": {
                    x += distance;
                    break;
                }
                case "South": {
                    x -= distance;
                    break;
                }
                case "West": {
                    y -= distance;
                    break;
                }
                case "East": {
                    y += distance;
                    break;
                }
            }
        }
        sc.close();
        System.out.printf("%d %d", y, x);
    }
}