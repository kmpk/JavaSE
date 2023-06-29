package se.codewars.kyu8;

import java.util.Arrays;

public class CustomSum {
    public static int sum(int[] numbers)
    {
        if (numbers==null||numbers.length<2) return 0;
        return Arrays.stream(numbers).sum()- Arrays.stream(numbers).max().getAsInt()- Arrays.stream(numbers).min().getAsInt();
    }
}
