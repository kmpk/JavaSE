package leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder original = new StringBuilder();
        StringBuilder reversed = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                char ch = Character.toLowerCase(c);
                original.append(ch);
                reversed.insert(0, ch);
            }
        }
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != reversed.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
