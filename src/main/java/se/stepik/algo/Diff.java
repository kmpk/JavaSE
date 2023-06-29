package se.stepik.algo;

import static java.lang.Math.*;

public class Diff {
    public static void main(String... args){
        int n = 1000000000;
        System.out.println("sqrt(log4 n) : " + sqrt(log(n)));
        System.out.println("log2 log2 n : " + log(log(n)));
        System.out.println("log3 n : " + log(n));
        System.out.println("(log2 (n)) ^2 : " + pow(log(n),2));
        System.out.println("sqrt(n) : " + sqrt(n));
        System.out.println("n/(log5 n) : " + n/(log(n)));
        System.out.println("3^(log2 n) : " + pow(3,log(n)));
        System.out.println("7^(log2 n) : " + pow(7,log(n)));
        System.out.println("n^2 : " + pow(n,2));
        System.out.println("2^n : " + pow(2,n));
        System.out.println("log2(n!) : " + 0);
        System.out.println("4^n : " + pow(4,n));
        System.out.println("2^3n : " + pow(2,3*n));
        System.out.println("(log2 n)^(log2 n) : " + pow(log(n),log(n)));
        System.out.println("n^(log2 n) : " + pow(n,log(n)));
        System.out.println("n^sqrt(n) : " + pow(n,sqrt(n)));
        System.out.println("n! : " + 0);
        System.out.println("2^2^n : " + pow(2,pow(2,n)));
    }
}
/*
print(math.log(math.log(n, 2)))
print(math.sqrt(math.log(n, 4)))
print(math.log(n, 3))
print(math.log(n, 2) ** 2)
print(math.sqrt(n))
print(n / math.log(n, 5))
print(math.log(math.factorial(n),2))
print(3 ** math.log(n, 2))
print(n ** 2)
print(7 ** (math.log(n, 2)))
print(math.log(n, 2) ** (math.log(n, 2)))
print(n ** (math.log(n, 2)))
print(n ** (math.sqrt(n)))
print(2 ** n)
print(4 ** n)
print(2 ** (3 * n))
print(math.factorial(n))
 */