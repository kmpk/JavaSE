package se.hackerrank.basicstatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinomialDistribution2 {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");
            double p = Double.parseDouble(input[0]) / 100;
            double q = 1 - p;
            int n = Integer.parseInt(input[1]);
            double result = 0;
            for (int i = 0; i <= 2; i++) {
                result += binomial(10, i, p / (p + q));
            }
            System.out.printf("%.3f\n", result);
            result=0;
            for (int i = 2; i <= 10; i++) {
                result += binomial(10, i, p / (p + q));
            }
            System.out.printf("%.3f\n", result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static int factorial(int n) {
        if (n == 0) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int combination(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private static double binomial(int n, int k, double p) {
        return combination(n, k) * Math.pow(p, k) * Math.pow(1 - p, n - k);
    }
}
