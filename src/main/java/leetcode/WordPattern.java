package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");
        if (split.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverseMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String s1 = split[i];
            if (map.get(c) == null && reverseMap.get(s1) == null) {
                map.put(c, s1);
                reverseMap.put(s1, c);
            } else if (!Objects.equals(map.get(c), s1) || !Objects.equals(c, reverseMap.get(s1))) {
                return false;
            }
        }
        return true;
    }
}
