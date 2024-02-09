package codewars.kyu4;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {
    private static final int SECONDS_IN_YEAR = 60 * 60 * 24 * 365;
    private static final int SECONDS_IN_DAY = 60 * 60 * 24;
    private static final int SECONDS_IN_HOUR = 60 * 60;
    private static final int SECONDS_IN_MINUTE = 60;

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }
        List<Integer> timeComponents = exctractTimeComponents(seconds);
        List<String> timeComponentStrings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int component = timeComponents.get(i);
            if (component != 0) {
                String s = component + " " + getTimeComponentName(i);
                if (component > 1) {
                    s += "s";
                }
                timeComponentStrings.add(s);
            }
        }
        if (timeComponentStrings.size() == 1) {
            return timeComponentStrings.get(0);
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < timeComponentStrings.size(); i++) {
                if (i + 2 == timeComponentStrings.size()) {
                    result.append(timeComponentStrings.get(i)).append(" and ");
                } else {
                    result.append(timeComponentStrings.get(i)).append(", ");
                }
            }
            return result.substring(0, result.length() - 2);
        }

    }

    private static String getTimeComponentName(int pos) {
        switch (pos) {
            case 0:
                return "year";
            case 1:
                return "day";
            case 2:
                return "hour";
            case 3:
                return "minute";
            default:
                return "second";
        }
    }

    private static List<Integer> exctractTimeComponents(int seconds) {
//        int years = seconds / SECONDS_IN_YEAR;
//        seconds %= SECONDS_IN_YEAR;
//        int days = seconds / SECONDS_IN_DAY;
//        seconds %= SECONDS_IN_DAY;
//        int hours = seconds / SECONDS_IN_HOUR;
//        seconds %= SECONDS_IN_HOUR;
//        int minutes = seconds / SECONDS_IN_MINUTE;
//        seconds %= SECONDS_IN_MINUTE;
//        return List.of(years, days, hours, minutes, seconds);
        return null;
    }
}
