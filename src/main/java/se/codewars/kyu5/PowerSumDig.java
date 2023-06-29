package se.codewars.kyu5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSumDig {
    public static long powerSumDigTerm(int n) {
        List<Long> a = new ArrayList<Long>();

        for (int b = 2; b < 40000; b++) {
            long value = b;
            for (int e = 2; e < 500; e++) {
                value *= b;

                if (DigitSum(value) == b) {
                    if (value>0) a.add(value);
                }
                if (a.size() > 500) break;
            }
            if (a.size() > 500) break;
        }
        Collections.sort(a);
        return a.get(n-1);
    }

    private static long DigitSum(long value) {
        String numberString = String.valueOf(value);
        long result = 0;
        for (char c : numberString.toCharArray()) {
            result += Character.getNumericValue(c);
        }
        return result;
    }
}
