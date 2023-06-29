package hyperskill.equations;

import java.util.Scanner;

public class TwoWars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        double y = getY(a, b, c, d, e, f);
        double x = getX(a, b, c, y);
        System.out.printf("%.5f %.5f", x, y);
    }

    private static double getY(double a, double b, double c, double d, double e, double f) {
        return (f - c * (d / a)) / (e - b * (d / a));
    }

    private static double getX(double a, double b, double c, double y) {
        return (c - b * y) / a;
    }
}
