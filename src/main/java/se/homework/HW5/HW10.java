package se.homework.HW5;

public class HW10 {
    public void finalize(){
        System.out.println("in finalize");
    }
    public static void main(String... strings){
        new HW10();
    }
}
