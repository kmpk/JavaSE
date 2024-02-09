package codewars.kyu7;

import java.util.HashSet;
import java.util.Set;

public class isogram {
    public static boolean isIsogram(String str) {
        Set<Character> letters = new HashSet<>();
        for (char c : str.toCharArray()){
            char ch = Character.toLowerCase(c);
            if (!letters.contains(ch)){
                letters.add(ch);
            } else return false;
        }
        return true;
    }
}
