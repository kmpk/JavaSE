package codewars.beta;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MaxNumWithGivenDigitSum {
    public static long max(int x) {
        if (x < 0 || x > 45) {
            return -1;
        }
        if (x == 0) {
            return 0;
        }
        int nextTriangularNumber = 0;
        int triangularNumber = 0;
        int triangularNumberIndex = -1;
        while (nextTriangularNumber <= x) {
            triangularNumberIndex++;
            triangularNumber = nextTriangularNumber;
            nextTriangularNumber = triangularNumberIndex * (triangularNumberIndex + 1) / 2;
        }
        DigitsHolder digitsHolder = new DigitsHolder(triangularNumberIndex);
        for (int i = 0; i < x - triangularNumber; i++) {
            digitsHolder.increaseHighestPossibleDigit();
        }
        return digitsHolder.getResultNumber();
    }

    private static class DigitsHolder {
        Set<Integer> digitsSet = new TreeSet<>();
        {
            digitsSet.addAll(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        }
        Set<Integer> resultDigits = new TreeSet<>(Comparator.reverseOrder());

        private DigitsHolder(int digitsNumber) {
            for (int i = 0; i < digitsNumber; i++) {
                digitsSet.remove(i);
                resultDigits.add(i);
            }
        }

        void increaseHighestPossibleDigit() {
            Iterator<Integer> iterator = resultDigits.iterator();
            int currentDigit = iterator.next();
            while (!isDigitUnused(currentDigit + 1)) {
                currentDigit = iterator.next();
            }
            swapDigits(currentDigit, currentDigit + 1);
        }

        boolean isDigitUnused(int digit) {
            return digitsSet.contains(digit);
        }

        void swapDigits(int i, int j) {
            resultDigits.remove(i);
            digitsSet.add(i);
            resultDigits.add(j);
            digitsSet.remove(j);
        }

        long getResultNumber() {
            StringBuilder result = new StringBuilder();
            resultDigits.forEach(result::append);
            return Long.parseLong(result.toString());
        }
    }
}
