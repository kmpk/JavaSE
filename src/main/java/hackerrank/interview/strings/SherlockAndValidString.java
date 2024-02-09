package hackerrank.interview.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndValidString {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String a = br.readLine();
            System.out.println(altChars(a) ? "YES" : "NO");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean altChars(String a) {
        if (a.length() < 3) return true;
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : a.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            map2.merge(e.getValue(), 1, Integer::sum);
        }
        if (map2.size() > 2) return false;
        if (map2.size() == 1) return true;
        else if (map2.size() == 2) {
            Map.Entry<Integer, Integer> entry1 = null;
            Map.Entry<Integer, Integer> entry2 = null;
            for (Map.Entry<Integer, Integer> e : map2.entrySet()) {
                if (entry1 == null) entry1 = e;
                else entry2 = e;
            }
            if (entry1.getValue() != 1 && entry2.getValue() != 1) return false;
            if (entry1.getValue() == 1 && entry2.getValue() == 1) {
                if (Math.abs(entry1.getValue() - entry2.getValue()) == 1) return true;
                else return false;
            }
            if ((entry1.getValue() == 1 && entry1.getKey() == 1) || (entry2.getKey() == 1 && entry2.getValue() == 1))
                return true;
            else {
                int freq, wrongFreq;
                int count, wrongCount;
                if (entry1.getValue() > entry2.getValue()) {
                    freq = entry1.getKey();
                    count = entry1.getValue();
                    wrongCount = entry2.getValue();
                    wrongFreq = entry2.getKey();
                } else {
                    freq = entry2.getKey();
                    count = entry2.getValue();
                    wrongCount = entry1.getValue();
                    wrongFreq = entry1.getKey();
                }
                return ((wrongCount == 1 && wrongFreq == 1) || (wrongFreq - freq == 1));
            }
        }
        return false;
    }
}
