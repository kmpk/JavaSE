package se.codewars.kyu6;

public class Order {
    public static String order(String words) {
        if (words == null || words.isEmpty()) return "";
        String[] wordsArray = words.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (String s : wordsArray) {
                if (s.contains(Integer.toString(i))) {
                    sb.append(String.format("%s ", s));
                    break;
                }
            }
        }
        return sb.toString().trim();
    }
}
