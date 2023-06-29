package se.homework.HW5;

import java.util.HashSet;
import java.util.List;

public class HW14 {
    static String s1 = "s1";
    static String s2;
    static{
        s2="s2";
    }
    public static void main(String[] args){
        HashSet<Object> a;
        System.out.println("inside main");
        System.out.println(s1);
        System.out.println(s2);
    }
}
