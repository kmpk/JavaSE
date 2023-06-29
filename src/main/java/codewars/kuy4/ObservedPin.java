package codewars.kuy4;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class ObservedPin {
    public static List<String> getPINs(String observed) {
        List<String> pins = new ArrayList<>();
        pins.add(observed);
        addMutations(pins, 0);
        return pins;
    } // getPINs

    static void addMutations(List<String> list, int start) {
        List<String> newPins = new ArrayList<>();
        for (String s : list) {
            newPins.addAll(mutateCharAt(start, s));
        }
        list.addAll(newPins);
        if (start < list.get(0).length() - 1) {
            addMutations(list, start + 1);
        }
    }

    //        │ 1 │ 2 │ 3 │
//        ├───┼───┼───┤
//        │ 4 │ 5 │ 6 │
//        ├───┼───┼───┤
//        │ 7 │ 8 │ 9 │
//        └───┼───┼───┘
//        │ 0 │
//
    static List<String> mutateCharAt(int i, String s) {
        StringBuilder b = new StringBuilder(s);
        char c = s.charAt(i);
        List<String> result = new ArrayList<>();
        switch (c) {
            case '1' -> {
                b.setCharAt(i, '2');
                result.add(b.toString());
                b.setCharAt(i, '4');
                result.add(b.toString());
            }
            case '2' -> {
                b.setCharAt(i, '1');
                result.add(b.toString());
                b.setCharAt(i, '3');
                result.add(b.toString());
                b.setCharAt(i, '5');
                result.add(b.toString());
            }
            case '3' -> {
                b.setCharAt(i, '2');
                result.add(b.toString());
                b.setCharAt(i, '6');
                result.add(b.toString());
            }
            case '4' -> {
                b.setCharAt(i, '1');
                result.add(b.toString());
                b.setCharAt(i, '5');
                result.add(b.toString());
                b.setCharAt(i, '7');
                result.add(b.toString());
            }
            case '5' -> {
                b.setCharAt(i, '2');
                result.add(b.toString());
                b.setCharAt(i, '4');
                result.add(b.toString());
                b.setCharAt(i, '6');
                result.add(b.toString());
                b.setCharAt(i, '8');
                result.add(b.toString());
            }
            case '6' -> {
                b.setCharAt(i, '3');
                result.add(b.toString());
                b.setCharAt(i, '5');
                result.add(b.toString());
                b.setCharAt(i, '9');
                result.add(b.toString());
            }
            case '7' -> {
                b.setCharAt(i, '4');
                result.add(b.toString());
                b.setCharAt(i, '8');
                result.add(b.toString());
            }
            case '8' -> {
                b.setCharAt(i, '5');
                result.add(b.toString());
                b.setCharAt(i, '7');
                result.add(b.toString());
                b.setCharAt(i, '9');
                result.add(b.toString());
                b.setCharAt(i, '0');
                result.add(b.toString());
            }
            case '9' -> {
                b.setCharAt(i, '8');
                result.add(b.toString());
                b.setCharAt(i, '6');
                result.add(b.toString());
            }
            case '0' -> {
                b.setCharAt(i, '8');
                result.add(b.toString());
            }
            default -> throw new IllegalArgumentException("Wrong input");
        }
        ;
        return result;
    }
}