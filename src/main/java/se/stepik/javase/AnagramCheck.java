package se.stepik.javase;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(checkAnagram(s, s2) ? "True" : "False");
    }

    private static boolean checkAnagram(String s1, String s2) {
        Map<Character, Integer> charMap1 = s1.chars().mapToObj(c -> (char) c).map(Character::toLowerCase).collect(Collectors.toMap(c -> c, c -> 1, Integer::sum));
        Map<Character, Integer> charMap2 = s2.chars().mapToObj(c -> (char) c).map(Character::toLowerCase).collect(Collectors.toMap(c -> c, c -> 1, Integer::sum));
        return charMap1.equals(charMap2);
    }
}
