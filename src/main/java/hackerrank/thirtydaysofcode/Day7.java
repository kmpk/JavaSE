package hackerrank.thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day7 {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine(); //ignore first
            String[] input = br.readLine().split(" ");
            StringBuilder builder = new StringBuilder();
            for (int i = input.length - 1; i >= 0; i--) {
                builder.append(input[i]).append(" ");
            }
            builder.deleteCharAt(builder.lastIndexOf(" "));
            System.out.println(builder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
