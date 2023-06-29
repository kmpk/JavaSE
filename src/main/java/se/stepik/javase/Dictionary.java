package se.stepik.javase;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Map<String, Set<String>> dictionary = new HashMap<>();
            int j = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < j; i++) {
                String[] input = sc.nextLine().split(" - ");
                for (String s : input[1].split(", ")) {
                    dictionary.merge(s, initSet(input[0]), Dictionary::combineSets);
                }
            }
            System.out.println(dictionary.size());
            TreeSet<String> words = new TreeSet<>(dictionary.keySet());
            for (String s : words) {
                StringBuilder sb = new StringBuilder();
                sb.append(s).append(" - ");
                dictionary.get(s).forEach(str -> sb.append(str).append(", "));
                sb.deleteCharAt(sb.length() - 1).deleteCharAt(sb.length() - 1);
                System.out.println(sb);
            }
        }
    }

    private static Set<String> initSet(String s) {
        Set<String> result = new TreeSet<>();
        result.add(s);
        return result;
    }

    private static Set<String> combineSets(Set<String> set1, Set<String> set2) {
        set1.addAll(set2);
        return set1;
    }
}
