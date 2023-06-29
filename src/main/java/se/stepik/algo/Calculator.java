package se.stepik.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Calculator {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Calc c = Calc.create(Integer.parseInt(br.readLine()));
            System.out.println(c.getResult());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Calc {
    private final int[] arr;

    private Calc(int i) {
        arr = new int[i + 1];
    }

    public static Calc create(int i) {
        Calc c = new Calc(i);
        c.fillArray();
        return c;
    }

    private void fillArray() {
        arr[0] = -1;
        arr[1] = 0;

        for (int i = 2; i < arr.length; i++) {
            int x3 = i % 3 == 0 ? arr[i / 3] + 1 : Integer.MAX_VALUE;
            int x2 = i % 2 == 0 ? arr[i / 2] + 1 : Integer.MAX_VALUE;
            int plusOne = arr[i - 1] + 1;
            arr[i] = Integer.min(Integer.min(x2, x3), plusOne);
        }
    }

    public String getResult() {
        int i = arr.length - 1;
        Stack<Integer> result = new Stack<>();
        result.push(i);
        while (i != 1) {
            int x3 = i % 3 == 0 ? arr[i / 3] : Integer.MAX_VALUE;
            int x2 = i % 2 == 0 ? arr[i / 2] : Integer.MAX_VALUE;
            int minusOne = arr[i - 1];
            if (x3 <= x2 && x3 <= minusOne) {
                i /= 3;
            } else if (x2 <= x3 && x2 <= minusOne) {
                i /= 2;
            } else {
                i -= 1;
            }
            result.push(i);
        }
        StringBuilder sb2 = new StringBuilder("" + arr[arr.length - 1]).append("\n");
        while (!result.empty()) {
            sb2.append(result.pop()).append(" ");
        }
        return sb2.deleteCharAt(sb2.lastIndexOf(" ")).toString();
    }
}
