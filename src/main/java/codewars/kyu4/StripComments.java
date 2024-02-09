package codewars.kyu4;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        String[] lines = text.split("\n");
        StringBuilder result = new StringBuilder();
        for (String s : lines) {
            String current = s;
            for (String marker : commentSymbols) {
                if (current.contains(marker)) {
                    current = current.substring(0, current.indexOf(marker));
                }
            }
            current = current.replaceAll("\\s+$", "");
            result.append(current);
            result.append("\n");
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }
}