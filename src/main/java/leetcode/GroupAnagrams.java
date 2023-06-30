package leetcode;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for (String s : strs) {
            String key = getSortedCharsString(getCharCountMap(s));
            List<String> strings = result.computeIfAbsent(key, str -> new ArrayList<>());
            strings.add(s);
        }
        return List.copyOf(result.values());
    }

    private String getSortedCharsString(Map<Character, Integer> map) {
        StringBuilder builder = new StringBuilder();
        map.entrySet().stream()
                .sorted((e1,e2)->{
                    char c1 = e1.getKey();
                    char c2 = e2.getKey();
                    return Character.compare(c1,c2);
                })
                .forEach(e -> {
                    for (int i=0;i<e.getValue();i++){
                        builder.append((char) e.getKey());
                    }
                });
        return builder.toString();
    }

    private Map<Character, Integer> getCharCountMap(String s) {
        Map<Character, Integer> result = new HashMap<>();
        s.chars().forEach(i -> result.merge((char) i, 1, Integer::sum));
        return result;
    }
}
