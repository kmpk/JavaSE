package codewars.kyu6;

import java.util.HashMap;
import java.util.Map;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> charactersMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charactersMap.merge(c, 1, Integer::sum);
        }
        for (char c : str2.toCharArray()) {
            Integer currentCharCount = charactersMap.get(c);
            if (currentCharCount != null && currentCharCount > 0) {
                charactersMap.put(c, --currentCharCount);
            } else return false;
        }
        return true;
    }
}
