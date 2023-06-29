package se.stepik.javase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SpellChecker {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Set<String> dictionarySet = new HashSet<>();
            Set<String> unknownWordsSet = new HashSet<>();
            int j = Integer.parseInt(br.readLine());
            for (int i = 0; i < j; i++) {
                dictionarySet.add(br.readLine().toLowerCase());
            }
            j = Integer.parseInt(br.readLine());
            for (int i = 0; i < j; i++) {
                String[] input = br.readLine().split(" ");
                for (String s : input) {
                    if (!dictionarySet.contains(s.toLowerCase()))
                        unknownWordsSet.add(s);
                }
            }
            unknownWordsSet.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
