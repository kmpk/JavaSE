package codewars.kyu6;

public class Printer {
    public static String printerError(String s) {
        // your code
        int errors = 0;
        for (char c : s.toCharArray()) {
            if (!(c > 96 && c < 110)) errors++;
        }
        return String.format("%d/%d",errors,s.length());
    }
}
