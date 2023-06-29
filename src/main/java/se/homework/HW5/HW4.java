package se.homework.HW5;

public class HW4 {
    public HW4(){
        System.out.println("in constructor");
    }
    public HW4(String s){
        System.out.println(s);
    }

    public static void main(String... a){
        new HW4();
        new HW4("custom message");
    }
}
