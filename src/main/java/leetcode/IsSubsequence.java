package leetcode;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        if (t.length() < s.length()) {
            return false;
        }
        int secondPointer = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isFound = false;
            while (!isFound) {
                if (t.length() == secondPointer) {
                    return false;
                }
                if (t.charAt(secondPointer) == c) {
                    isFound = true;
                }
                secondPointer++;
            }
        }
        return true;
    }
}
