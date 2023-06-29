package se.homework.HW5;

public class HW18 {
    HW18(String s){
        System.out.println(s);
    }
    public static void main(String... args){
        HW18[] array = new HW18[10];
        for (int i = 0; i<array.length; i++){
            array[i] = new HW18(Integer.toString(i));
        }
    }
}