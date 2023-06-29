package se.homework.HW5;

import java.util.*;
import java.util.concurrent.Phaser;
import java.util.stream.IntStream;

public class HW1 {
    private static String s;

    public static void main(String... args) {
        System.out.println(isPalindrome(1000000000000000001L));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1}));
        System.out.println(calculateSqrt(9));
        System.out.println(calculateSqrt(4));
        System.out.println(calculateSqrt(5));
    }

    private static int calculateSqrt(int input) {
        return (int) Math.sqrt(input);
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> ints = new HashSet<>();
        for (int i : nums) {
            ints.add(i);
        }
        return ints.size() != nums.length;
    }

    private static boolean isPalindrome(long l) {
        String longAsString = Long.toString(l);
        int length = longAsString.length();
        for (int i = 0; i < length / 2; i++) {
            if (longAsString.charAt(i) != longAsString.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
