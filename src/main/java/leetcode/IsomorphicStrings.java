package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> reverseMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.containsKey(c1) && map.get(c1) != c2) {
                return false;
            } else if (reverseMap.containsKey(c2) && reverseMap.get(c2) != c1) {
                return false;
            } else {
                map.put(c1, c2);
                reverseMap.put(c2, c1);
            }
        }
        return true;
    }
}
