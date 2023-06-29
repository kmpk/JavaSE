package se.codewars.kyu7;

import java.util.stream.Stream;

public class NthSeries {

    public static String seriesSum(int n) {
        return String.format("%.2f", Stream
                .iterate(1d, d -> d + 1d)
                .map(d -> 1d / (-2d + 3d * d))
                .limit(n).reduce(Double::sum)
                .orElse(1d)).replaceAll(",",".");
    }
}
