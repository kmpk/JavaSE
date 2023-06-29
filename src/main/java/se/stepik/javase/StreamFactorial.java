package se.stepik.javase;

import java.util.stream.LongStream;

public class StreamFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(10L));
    }

    private static long factorial(long n) {
        //if (n==0) return 1;
        return LongStream.rangeClosed(1,n).reduce((l1,l2)->l1*l2).orElse(1);
    }
}
