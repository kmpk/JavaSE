package codewars.kuy4;

public class AddingBigNumbers {
    public static String add(String a, String b) {
        Summator summator = new Summator();
        int aLength = a.length();
        int bLength = b.length();
        int maxLength = Math.max(aLength, bLength);
        StringBuilder result = new StringBuilder(maxLength + 1);
        for (int i = 1; i <= maxLength + 1; i++) {
            char aChar = i > aLength ? '0' : a.charAt(aLength - i);
            char bChar = i > bLength ? '0' : b.charAt(bLength - i);
            result.insert(0, summator.sumChars(aChar, bChar));
        }
        while (result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        return result.toString();
    }

    private static class Summator {
        boolean overflow = false;

        public char sumChars(char a, char b) {
            int i = convertToDigit(a) + convertToDigit(b);
            if (overflow) {
                i++;
                overflow = false;
            }
            if (i > 9) {
                overflow = true;
                return convertToChar(i % 10);
            } else {
                return convertToChar(i);
            }
        }

        private int convertToDigit(char c) {
            return c - 48;
        }

        private char convertToChar(int digit) {
            return (char) (48 + digit);
        }
    }
}
