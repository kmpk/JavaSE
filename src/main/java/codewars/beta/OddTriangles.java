package codewars.beta;

import java.math.BigInteger;

public class OddTriangles {
    public static BigInteger sum(int n) {
        int numOfIntegers = n * (n + 1) / 2;
        return BigInteger.valueOf(numOfIntegers).pow(2);//?!
    }
}
