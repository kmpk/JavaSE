package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean valid = true;
            switch (ch) {
                case '(', '[', '{' -> stack.add(ch);
                case ')' -> {
                    if (stack.isEmpty() || stack.peekLast() != '(') {
                        valid=false;
                    } else {
                        stack.removeLast();
                    }
                }
                case ']' -> {
                    if (stack.isEmpty() || stack.peekLast() != '[') {
                        valid=false;
                    } else {
                        stack.removeLast();
                    }
                }
                case '}' -> {
                    if (stack.isEmpty() || stack.peekLast() != '{') {
                        valid=false;
                    } else {
                        stack.removeLast();
                    }
                }
                default -> valid=false;
            }
            if (!valid){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
