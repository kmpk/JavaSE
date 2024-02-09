package hackerrank.interview.greedalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GreedyFlorist {
    public static void main(String... args) {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = bf.readLine().split(" ");
            int[] friendsCoeffs = new int[Integer.parseInt(input[0])];
            int[] flowerPrices = new int[Integer.parseInt(input[0])];
            int friendsCount = Integer.parseInt(input[1]);
            input = bf.readLine().split(" ");
            for (int i = 0; i < flowerPrices.length; i++) {
                flowerPrices[i] = Integer.parseInt(input[i]);
            }
            Arrays.sort(flowerPrices);
            for (int i = 0; i < flowerPrices.length / 2; i++) {
                int temp = flowerPrices[i];
                flowerPrices[i] = flowerPrices[flowerPrices.length - i - 1];
                flowerPrices[flowerPrices.length - i - 1] = temp;
            }
            int currentCoeff = 0;
            int currentIteration = 0;
            for (int i = 0; i < friendsCoeffs.length; i++) {
                if (currentIteration < friendsCount) {
                    friendsCoeffs[i] = currentCoeff;
                    currentIteration++;
                } else {
                    currentIteration = 1;
                    currentCoeff++;
                    friendsCoeffs[i] = currentCoeff;
                }
            }
            int result = 0;
            for (int i = 0; i < flowerPrices.length; i++) {
                result += (friendsCoeffs[i] + 1) * flowerPrices[i];
            }
            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
