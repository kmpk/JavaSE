package se.stepik.javase;

import java.util.Scanner;

public class QueenHitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte x1, y1, x2, y2;
        String[] input = sc.nextLine().split(" ");
        x1 = Byte.parseByte(input[0]);
        y1 = Byte.parseByte(input[1]);
        x2 = Byte.parseByte(input[2]);
        y2 = Byte.parseByte(input[3]);
        System.out.println(checkHit(x1, y1, x2, y2) ? "YES" : "NO");
    }

    private static boolean checkHit(byte x1, byte y1, byte x2, byte y2) {
        return (x1 == x2 || y1 == y2) || Math.abs(x1 - x2) == Math.abs(y1 - y2);
    }
}
