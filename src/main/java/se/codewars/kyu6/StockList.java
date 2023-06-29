package se.codewars.kyu6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StockList {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt == null || lstOf1stLetter == null) return "";
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";
        Map<String, Long> categoryMap = new HashMap<>();
        Arrays.stream(lstOfArt).forEach(s -> categoryMap.merge(s.substring(0, 1), getQuantity(s), Long::sum));
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(lstOf1stLetter).forEach(s -> stringBuilder.append(String.format("(%s : %d) - ", s, categoryMap.getOrDefault(s, 0L))));
        return stringBuilder.replace(stringBuilder.lastIndexOf("-"), stringBuilder.lastIndexOf("-") + 1, "").toString().trim();
    }

    private static long getQuantity(String book) {
        String[] temp = book.split(" ");
        return Long.parseLong(temp[1]);
    }
}
