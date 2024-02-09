package codewars.kyu6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        Set<Character> charSet = new HashSet<>();
        for (char c : s1.toCharArray()){
            charSet.add(c);
        }
        for (char c : s2.toCharArray()){
            charSet.add(c);
        }
        char[] charArray = new char[charSet.size()];
        int i =0;
        for (Character c : charSet){
            charArray[i] = c;
            i++;
        }
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
