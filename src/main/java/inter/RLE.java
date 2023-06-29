package inter;

public class RLE {

    public static void main(String[] args) {
        System.out.println(rle("AAAAABAAAAA"));
    }

    private static String rle(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();

        int counter = 0;
        char current = 0;
        for (char c : s.toCharArray()) {
            if (counter > 0 && current != c) {
                appendCharToOutput(result, counter, current);
                counter = 0;
                current = 0;
            }
            if (current != c) {
                current = c;
            }
            counter++;
        }
        appendCharToOutput(result, counter, current);
        return result.toString();
    }

    private static void appendCharToOutput(StringBuilder result, int counter, char current) {
        result.append(current).append(counter > 1 ? counter : "");
    }
}
