package se.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            String s = in.next();
            int i = Integer.parseInt(s);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
        in.close();
    }
}
