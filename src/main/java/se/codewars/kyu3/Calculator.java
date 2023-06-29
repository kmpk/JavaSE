package se.codewars.kyu3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Calculator {
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
