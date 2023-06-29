package se.homework.HW5;

public class HW2 {
    private String s1 = "default";
    private String s2;
    public static void main(String... args){
        HW2 object = new HW2("constructor");
        System.out.println(object.s1);
        System.out.println(object.s2);
    }

    private HW2(String s){
        this.s2=s;
    }
}
