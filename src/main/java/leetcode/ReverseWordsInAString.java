package leetcode;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].isBlank()){
                continue;
            }
            if (builder.isEmpty()){
                builder.append(words[i]);
            } else {
                builder.append(" ").append(words[i]);
            }
        }
        return builder.toString();
    }
}
