package codewars.kyu5;

public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        for (int i = 2; i < 2 * Math.log(n); i++) {
            for (int j = 2; Math.pow(j, i) <= n; j++) {
                if (Math.pow(j, i) == n) {
                    return new int[]{j, i};
                }
            }
        }
        return null;
    }
}


/*
import java.math.BigInteger;

public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        double epsilon = 0.00001;
        int exponent = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (BigInteger.valueOf(i).isProbablePrime(1)) {
                if (Math.abs(Math.pow(n, 1.0 / i) - Math.round(Math.pow(n, 1.0 / i))) < epsilon) {
                    exponent = i;
                    break;
                }
            }
        }
        int base = 0;
        if (exponent != 0) {
            base = (int) Math.round(Math.pow(n, 1.0 / exponent));
            if (base != 1) return new int[]{base, exponent};
        }
        return null;
    }
}
*/
