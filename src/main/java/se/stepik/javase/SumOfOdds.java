package se.stepik.javase;

import java.util.Scanner;
import java.util.stream.LongStream;

public class SumOfOdds {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(sumOfOddNumbersInRange(sc.nextInt(), sc.nextInt()));
        }
    }

    public static long sumOfOddNumbersInRange(long start, long end) {
        return LongStream.rangeClosed(start, end).filter(l -> l % 2 != 0).sum();
    }
}
