package leetcode;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        s.chars()
                .forEach(i -> charMap.merge((char) i, 1, Integer::sum));
        final Optional<Map.Entry<Character, Integer>> first = charMap.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst();
        if (first.isPresent()) {
            char firstUnique = first.get().getKey();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == firstUnique) {
                    return i;
                }
            }

        }
        return -1;
    }
}
