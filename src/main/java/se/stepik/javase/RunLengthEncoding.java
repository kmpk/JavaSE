package se.stepik.javase;

import java.util.Scanner;

public class RunLengthEncoding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(encode(sc.nextLine()));
        sc.close();
    }

    private static String encode(String s) {
        if (s == null || s.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        char current = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c == current) {
                counter++;
            } else {
                if (counter == 1) {
                    sb.append(current);
                } else {
                    sb.append(counter).append(current);
                }
                current = c;
                counter = 1;
            }
        }
        if (counter != 0) {
            if (counter == 1) {
                sb.append(current);
            } else {
                sb.append(counter).append(current);
            }
        }
        return sb.toString();
    }
}
