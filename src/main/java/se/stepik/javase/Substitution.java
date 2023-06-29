package se.stepik.javase;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Substitution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Map<Character, Character> encMap = new HashMap<>();
            Map<Character, Character> unEncMap = new HashMap<>();
            char[] orig = sc.nextLine().toCharArray();
            char[] sub = sc.nextLine().toCharArray();
            for (int i = 0; i < orig.length; i++) {
                encMap.put(orig[i], sub[i]);
                unEncMap.put(sub[i], orig[i]);
            }
            String encoded = sc.nextLine()
                    .chars()
                    .mapToObj(i->(char) i)
                    .map(encMap::get)
                    .collect(StringBuilder::new,StringBuilder::append,StringBuilder::append)
                    .toString();
            String unEncoded = sc.nextLine()
                    .chars()
                    .mapToObj(i->(char) i)
                    .map(unEncMap::get)
                    .collect(StringBuilder::new,StringBuilder::append,StringBuilder::append)
                    .toString();
            System.out.println(encoded);
            System.out.println(unEncoded);
        }
    }
}
