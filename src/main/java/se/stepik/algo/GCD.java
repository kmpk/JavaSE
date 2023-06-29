package se.stepik.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class GCD {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array = br.readLine().split(" ");
            BigInteger a = new  BigInteger(array[0]);
            BigInteger b = new  BigInteger(array[1]);
            long startTime = System.currentTimeMillis();
            System.out.println(GCDEucledes(a, b));
            System.out.println(System.currentTimeMillis() - startTime + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static BigInteger GCDEucledes(BigInteger a, BigInteger b) {
        if (a.equals(BigInteger.ZERO)) return b;
        if (b.equals(BigInteger.ZERO)) return a;
        while (check(a,b)) {
            if (a.compareTo(b) > 0)
                a=a.mod(b);
            else b=b.mod(a);
            System.out.println(a.toString() + " " + b.toString());
        }
        return (a.equals(BigInteger.ZERO))? b : a;
    }

    private static boolean check(BigInteger a, BigInteger b) {
        if (a.equals(BigInteger.ZERO) || b.equals(BigInteger.ZERO)) return false;
        return true;
    }
}
