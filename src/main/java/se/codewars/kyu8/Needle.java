package se.codewars.kyu8;

public class Needle {
    public static String findNeedle(Object[] haystack) {
        if (haystack==null||haystack.length==0) throw new IllegalArgumentException();
        for (int i = 0; i<haystack.length; i++){
            if (haystack[i]!=null && haystack[i].equals("needle")) return String.format("found the needle at position %d",i);
        }
        throw new IllegalArgumentException();
    }
}
