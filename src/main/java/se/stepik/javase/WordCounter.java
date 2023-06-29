package se.stepik.javase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> wordsMap = new HashMap<>();
        Arrays.stream(sc.nextLine().split(" ")).map(String::toLowerCase).forEach(s -> wordsMap.merge(s, 1, Integer::sum));
        for (Map.Entry<String, Integer> e : wordsMap.entrySet()) {
            System.out.printf("%s %d\n", e.getKey(), e.getValue());
        }
    }
}
