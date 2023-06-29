package se.hackerrank.interview.hashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
    public static void main(String... args) {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            int count = Integer.parseInt(bf.readLine());
            for (int i = 0; i < count; i++) {
                System.out.println(solve(bf.readLine()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int solve(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        int totalCount = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String currentSubString = s.substring(i, j);
                char[] chars = currentSubString.toCharArray();
                Arrays.sort(chars);
                currentSubString = String.valueOf(chars);
                if (map.containsKey(currentSubString)) {
                    int value = map.get(currentSubString);
                    totalCount += value;
                    map.put(currentSubString, value + 1);
                } else {
                    map.put(currentSubString, 1);
                }
            }
        }
        return totalCount;
    }
}
