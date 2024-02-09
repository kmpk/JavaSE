package codewars.kyu6;

public class Accumul {
    public static String accum(String s) {
        if (s.isEmpty()) return "";
        char[] charArray = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            result.append(Character.toUpperCase(charArray[i]));
            if (i > 0) {
                for (int j = 0; j < i; j++){
                    result.append(Character.toLowerCase(charArray[i]));
                }
            }
            result.append('-');
        }
        String str = result.toString();
        return str.substring(0, str.length() - 1);
    }
}
