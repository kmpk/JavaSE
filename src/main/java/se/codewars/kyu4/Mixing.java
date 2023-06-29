package se.codewars.kyu4;

import java.util.*;

public class Mixing {
    public static String mix(String s1, String s2) {
        Map<Character, Integer> s1Map = fillMap(s1);
        Map<Character, Integer> s2Map = fillMap(s2);
        StringBuilder sb = new StringBuilder();
        List<ResultUnit> resultList = new ArrayList<>();
        for (int i = 97; i < 123; i++) {
            char c = (char) i;
            int s1Count = s1Map.getOrDefault(c, 0);
            int s2Count = s2Map.getOrDefault(c, 0);
            if (s1Count > 1 || s2Count > 1) {
                if (s1Count == s2Count) {
                    sb.append("=:");
                    sb.append(generateChars(s1Count, c));
                    resultList.add(new ResultUnit(sb.toString(), s1Count));
                    sb = new StringBuilder();
                } else if (s1Count > s2Count) {
                    sb.append("1:");
                    sb.append(generateChars(s1Count, c));
                    resultList.add(new ResultUnit(sb.toString(), s1Count));
                    sb = new StringBuilder();
                } else {
                    sb.append("2:");
                    sb.append(generateChars(s2Count, c));
                    resultList.add(new ResultUnit(sb.toString(), s2Count));
                    sb = new StringBuilder();
                }
            }
        }
        resultList.sort(Comparator.naturalOrder());
        for (ResultUnit re : resultList) {
            sb.append(re);
            sb.append('/');
        }
        if (sb.lastIndexOf("/") != -1)
            sb.deleteCharAt((sb.length() - 1));
        return sb.toString();
    }

    private static Map<Character, Integer> fillMap(String s) {
        Map<Character, Integer> sMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c >= 97 && c <= 122)
                sMap.merge(c, 1, Integer::sum);
        }
        return sMap;
    }

    private static String generateChars(int n, char c) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(c);
        }
        return result.toString();
    }
}

class ResultUnit implements Comparable {
    private final String output;
    private final int count;

    int getCount() {
        return count;
    }

    ResultUnit(String output, int count) {
        this.output = output;
        this.count = count;
    }

    public String toString() {
        return output;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof ResultUnit) {
            ResultUnit resultUnit = (ResultUnit) o;
            if (count == resultUnit.getCount()) {
                return output.compareTo(resultUnit.toString());
            } else {
                return -(count - resultUnit.getCount());
            }
        }
        return 0;
    }
}
