package codewars.kuy5;

//Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
//
//        Examples
//        pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//        pigIt('Hello world !');     // elloHay orldway !

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatin {
    public static final Pattern PATTERN = Pattern.compile("(\\w+)");

    public static String pigIt(String str) {
        Matcher matcher = PATTERN.matcher(str);
        return matcher.replaceAll(match -> {
            String group = match.group();
            char c = group.charAt(0);
            return group.substring(1) + c + "ay";
        });
    }
}
