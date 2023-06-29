package se.hackerrank.thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day6 {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int input = Integer.parseInt(br.readLine());
            for (int i = 0; i < input; i++) {
                String inputString = br.readLine();
                StringBuilder evens = new StringBuilder();
                StringBuilder odds = new StringBuilder();
                for (int j = 0; j < inputString.length(); j++) {
                    if (j % 2 == 0) evens.append(inputString.toCharArray()[j]);
                    else odds.append(inputString.toCharArray()[j]);
                }
                System.out.println(evens.toString() + " " + odds.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
