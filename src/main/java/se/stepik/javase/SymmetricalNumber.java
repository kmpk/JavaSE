package se.stepik.javase;

import java.util.Scanner;

public class SymmetricalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = String.format("%4s", sc.nextLine()).replace(' ', '0');
        System.out.println(s.equals(new StringBuilder(s).reverse().toString()) ? 1 : 0);
        sc.close();
    }
}
