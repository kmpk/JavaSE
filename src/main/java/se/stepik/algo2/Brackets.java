package se.stepik.algo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String input = br.readLine();
                System.out.println(solve(input));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String solve(String s) {
        Set<Character> opbr = new HashSet<>();
        opbr.add('(');
        opbr.add('[');
        opbr.add('{');
        Set<Character> clbr = new HashSet<>();
        clbr.add(')');
        clbr.add(']');
        clbr.add('}');
        Stack<Character> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.empty()) {
                if (opbr.contains(c)) {
                    stack.push(c);
                    stack2.push(i);
                } else if (clbr.contains(c)) {
                    if (Character.compare(stack.peek(), reverse(c)) == 0) {
                        stack.pop();
                        stack2.pop();
                    } else {
                        return i + 1 + "";
                    }
                }
            } else {
                if (clbr.contains(c)) {
                    return i + 1 + "";
                }
                if (opbr.contains(c)) {
                    stack.push(c);
                    stack2.push(i);
                }
            }
        }
        if (stack.empty()) {
            return "Success";
        } else {
            return stack2.pop() + 1 + "";
        }
    }

    private static char reverse(char c) {
        if (c == ')') return '(';
        if (c == ']') return '[';
        if (c == '}') return '{';
        return ' ';
    }
}
