package inter.pkg;

import java.util.regex.Pattern;

public class IpParser {
    private static final Pattern IPV4_REGEXP = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    private final StringBuilder builder = new StringBuilder();

    public boolean isValidIp(CharSequence s) {
        return IPV4_REGEXP.matcher(s).matches();
    }

    public int parseIp(CharSequence s) {
        builder.setLength(0);
        int result = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '.') {
                builder.append(c);
            } else {
                result += parseInt(builder) << ((3 - counter) * 8);
                counter++;
                builder.setLength(0);
            }
        }
        result += parseInt(builder) << ((3 - counter) * 8);
        return result;
    }

    private int parseInt(CharSequence s) {
        if (s.length() == 3) {
            return parseDigit(s.charAt(0)) * 100 + parseDigit(s.charAt(1)) * 10 + parseDigit(s.charAt(2));
        } else if (s.length() == 2) {
            return parseDigit(s.charAt(0)) * 10 + parseDigit(s.charAt(1));
        } else if (s.length() == 1) {
            return parseDigit(s.charAt(0));
        } else {
            throw new RuntimeException("Unexpected token: " + s);
        }
    }

    private int parseDigit(char c) {
        return c - 48;
    }
}
