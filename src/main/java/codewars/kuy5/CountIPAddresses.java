package codewars.kuy5;

public class CountIPAddresses {
    public static long ipsBetween(String start, String end) {
        return convertIpv4ToLong(end) - convertIpv4ToLong(start);
    }

    public static long convertIpv4ToLong(CharSequence ipv4) {
        StringBuilder builder = new StringBuilder();
        long result = 0;
        int counter = 0;
        for (int i = 0; i < ipv4.length(); i++) {
            char c = ipv4.charAt(i);
            if (c != '.') {
                builder.append(c);
            } else {
                result += (long) parseIpv4Octet(builder) << ((3 - counter) * 8);
                counter++;
                builder.setLength(0);
            }
        }
        result += (long) parseIpv4Octet(builder) << ((3 - counter) * 8);
        return result;
    }

    private static int parseIpv4Octet(CharSequence s) {
        return switch (s.length()) {
            case 3 -> parseDigit(s.charAt(0)) * 100 + parseDigit(s.charAt(1)) * 10 + parseDigit(s.charAt(2));
            case 2 -> parseDigit(s.charAt(0)) * 10 + parseDigit(s.charAt(1));
            case 1 -> parseDigit(s.charAt(0));
            default -> throw new RuntimeException("Ipv4 octet must contain 1-3 digits " + s);
        };
    }

    private static int parseDigit(char c) {
        return c - 48;
    }
}



