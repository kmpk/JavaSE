package se.codewars.kyu6;

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        if (n == 0) return new double[] {};
        if (s.length!=3) return new double[] {};
        double[] result = new double[n];
        int bound = n>3? 3 : n;
        for (int i = 0; i < bound; i++) {
            result[i] = s[i];
        }
        for (int i = 3; i < n; i++) {
            result[i] = result[i - 3] + result[i - 2] + result[i - 1];
        }
        return result;
    }
}
