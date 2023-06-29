package se.stepik.javase;

import java.util.ArrayList;
import java.util.List;

class ListMultiplicator {

    /**
     * Multiplies original list provided numper of times
     *
     * @param list list to multiply
     * @param n    times to multiply, should be zero or greater
     */
    public static void multiply(List<?> list, int n) {
        wildcardHelper(list, n);
    }

    private static <T> void wildcardHelper(List<T> list, int n) {
        if (n == 0) list.clear();
        List<T> toCopy = new ArrayList<>(list);
        for (int i = 1; i < n; i++) {
            list.addAll(toCopy);
        }
    }

}
