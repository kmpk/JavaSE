package leetcode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int result = 1;
        boolean charFound = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (charFound){
                if (Character.isWhitespace(c)){
                    break;
                } else {
                    result++;
                }
            } else {
                if (!Character.isWhitespace(c)){
                    charFound=true;
                }
            }
        }
        return result;
    }
}
