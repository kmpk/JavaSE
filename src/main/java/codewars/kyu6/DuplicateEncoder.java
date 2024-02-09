package codewars.kyu6;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    static public String encode(String word) {
        Map<Character, Integer> charMap = new HashMap<>();
        char[] charArray = word.toLowerCase().toCharArray();
        for (char c : charArray) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < charArray.length; i++) {
            if (charMap.get(charArray[i]) == 1) {
                charArray[i] = '(';
            } else {
                charArray[i] = ')';
            }
        }
        return new String(charArray);
    }
}
