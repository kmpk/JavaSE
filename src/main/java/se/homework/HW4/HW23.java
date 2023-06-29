package se.homework.HW4;

import java.math.BigInteger;

public class HW23 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}
