package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Integer> numerals = new HashMap<>();

    static {
        numerals.put('I', 1);
        numerals.put('V', 5);
        numerals.put('X', 10);
        numerals.put('L', 50);
        numerals.put('C', 100);
        numerals.put('D', 500);
        numerals.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (i + 1 != s.length() && isSubstraction(current, s.charAt(i + 1))) {
                result -= numerals.get(current);
            } else {
                result += numerals.get(current);
            }
        }
        return result;
    }

    private static boolean isSubstraction(char first, char second) {
        return numerals.get(first) < numerals.get(second);
    }
}
