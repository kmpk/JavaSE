package se.hackerrank.thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day3 {
    public static void main(String... args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int i = Integer.parseInt(bufferedReader.readLine());
            if (i % 2 != 0)
                System.out.println("Weird");
            else if (i < 5 && i > 1) System.out.println("Not Weird");
            else if (i < 21 && i > 5) System.out.println("Weird");
            else System.out.println("Not Weird");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
