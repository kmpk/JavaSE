package hackerrank.interview.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Anagrams {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String a = br.readLine();
            String b = br.readLine();
            System.out.println(makeAnagram(a, b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int makeAnagram(String a, String b) {
        int result = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (Character c : a.toCharArray()) {
            map1.merge(c, 1, Integer::sum);
        }
        for (Character c : b.toCharArray()) {
            if (map1.containsKey(c)) {
                if (map1.get(c) > 0) map1.merge(c, -1, Integer::sum);
                else result++;
            } else {
                result++;
            }
        }
        for (Entry<Character, Integer> entry : map1.entrySet()) {
            result += entry.getValue();
        }
        return result;
    }
}
