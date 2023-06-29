package se.homework.HW1;

public class HW9 {
    public static void main(String args[]){
        int i = 1; //primitive int
        System.out.println(IntegerToString(i));
    }
    //method argument's class is Integer, not primitive int;
    private static String IntegerToString(Integer integer){
        return String.valueOf(integer);
    }
}
