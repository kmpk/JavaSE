package se.stepik.javase;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPalindrome(sc.nextLine()) ? "yes" : "no");

    }

    private static boolean isPalindrome(String candidate) {
        char[] charArray = candidate.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) return false;
        }
        return true;
    }
}
