package codewars.kyu4;

import java.util.regex.Pattern;

public class DivisibleByFive {

    public static Pattern pattern() {
        // Partial solution:
        return Pattern.compile("^0|(101(0)*)$");
    }

}