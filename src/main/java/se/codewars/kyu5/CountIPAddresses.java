package se.codewars.kyu5;

public class CountIPAddresses {
    public static long ipsBetween(String start, String end) {
        long first = 0;
        long second = 0;
        String[] startSplitted = start.split("\\.");
        String[] secondSplitted = end.split("\\.");
        int pow = 3;
        for (int i = 0; i < 4; i++) {
            first += Integer.parseInt(startSplitted[i]) * Math.pow(256, pow);
            second += Integer.parseInt(secondSplitted[i]) * Math.pow(256, pow);
            pow--;
        }
        return second - first;
    }
}
