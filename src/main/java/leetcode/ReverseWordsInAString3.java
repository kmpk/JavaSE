package leetcode;

public class ReverseWordsInAString3 {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        for (String str : s.split(" ")) {
            result.append(new StringBuilder(str).reverse()).append(" ");
        }
        return result.toString().strip();
    }
}
