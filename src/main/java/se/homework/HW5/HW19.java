package se.homework.HW5;

import java.util.Arrays;

public class HW19 {
    public static void f(String... s){
        System.out.println(Arrays.toString(s));
    }
    public static void main(String... args){
        f("1","2","3","4");
        f(new String[]{"1","2"});
    }
}
