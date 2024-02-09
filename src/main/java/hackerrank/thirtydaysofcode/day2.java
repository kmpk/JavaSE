package hackerrank.thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day2 {
    public static void main(String... args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            double mealCost = Double.parseDouble(bufferedReader.readLine());
            int tipPercent = Integer.parseInt(bufferedReader.readLine());
            int taxPercent = Integer.parseInt(bufferedReader.readLine());

            double result = mealCost + ((double) tipPercent / 100) * mealCost + ((double) taxPercent / 100) * mealCost;

            System.out.println(Math.round(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
