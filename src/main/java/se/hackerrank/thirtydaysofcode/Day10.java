package se.hackerrank.thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10 {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(consecutiveOnes(
                    Integer.toBinaryString(n).toCharArray()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int consecutiveOnes(char[] c) {
        int result = 0;
        int current = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '1') current++;
            else {
                result = (result < current) ? current : result;
                current = 0;
            }
        }
        return (result > current) ? result : current;
    }
}
