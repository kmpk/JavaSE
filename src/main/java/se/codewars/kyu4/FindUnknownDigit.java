package se.codewars.kyu4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FindUnknownDigit {
    public static int solveExpression(final String expression) {
        int missingDigit = -1;
        char operation = ' ';
        String firstNum = "", secondNum = "", result = "";
        int opIndex = 0;
        boolean opFound = false;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (!opFound && i != 0 && (c == '+' || c == '*' || c == '-')) {
                operation = c;
                opIndex = i;
                opFound = true;
                firstNum = expression.substring(0, i);
            } else if (c == '=') {
                secondNum = expression.substring(opIndex + 1, i);
                result = expression.substring(i + 1, expression.length());
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            double a = Double.parseDouble(firstNum.replaceAll("\\?", "" + i));
            double b = Double.parseDouble(secondNum.replaceAll("\\?", "" + i));
            String c = result.replaceAll("\\?", "" + i);
            if (("" + Math.round(Calculator.evaluate(a + " " + operation + " " + b))).equals(c) && !expression.contains("" + i))
                return i;
        }
        return missingDigit;
    }
}

//from other kata
class Calculator {
    public static Double evaluate(String expression) {
        List<String> entries = Arrays
                .stream(expression.split(" "))
                .collect(Collectors
                        .toCollection(LinkedList::new));
        for (int j = 0; j < 2; j++) {
            String op1, op2;
            op1 = (j == 0) ? "*" : "+";
            op2 = (j == 0) ? "/" : "-";
            for (int i = 0; i < entries.size(); i++) {
                String entry = entries.get(i);
                if (entry.equals(op1) || entry.equals(op2)) {
                    double result = proceed(entry, Double.parseDouble(entries.get(i - 1)), Double.parseDouble(entries.get(i + 1)));
                    entries.set(i - 1, null);
                    entries.set(i, null);
                    entries.set(i + 1, String.valueOf(result));
                }
            }
            entries.removeIf(Objects::isNull);
        }
        return Double.parseDouble(entries.get(0));
    }

    private static double proceed(String operation, double a, double b) {
        double result;
        switch (operation) {
            case "*": {
                result = a * b;
                break;
            }
            case "/": {
                result = a / b;
                break;
            }
            case "+": {
                result = a + b;
                break;
            }
            default: {
                result = a - b;
            }
        }
        return result;
    }
}
