package se.codewars.kyu7;

import java.util.Arrays;

public class LostSheeps {
    public static int lostSheeps(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepsTotal) {
        return sheepsTotal - Arrays.stream(fridayNightCounting).sum() - Arrays.stream(saturdayNightCounting).sum();
    }
}
