package se.stepik.algo2;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class MaxStack {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        MaxStackImpl<Integer> msi = new MaxStackImpl<>();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int j = i; j >= 0; j--) {
            String[] s = sc.nextLine().split(" ");
            switch (s[0]) {
                case "push": {
                    msi.push(Integer.parseInt(s[1]));
                    break;
                }
                case "max": {
                    sb.append(msi.max()).append("\n");
                    break;
                }
                case "pop": {
                    msi.pop();
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}

class MaxStackImpl<T extends Comparable> {
    private Stack<T> stack = new Stack<>();
    private Stack<T> maxStack = new Stack<>();

    public void push(T t) {
        stack.push(t);
        if (maxStack.size() != 0) {
            T currentMax = maxStack.peek();
            if (currentMax.compareTo(t) < 0) {
                maxStack.push(t);
            } else {
                maxStack.push(currentMax);
            }
        } else {
            maxStack.push(t);
        }
    }

    public T pop() {
        if (stack.size() == 0) {
            throw new EmptyStackException();
        }
        maxStack.pop();
        return stack.pop();
    }

    public T max() {
        if (maxStack.size() == 0) {
            throw new EmptyStackException();
        }
        return maxStack.peek();
    }
}
