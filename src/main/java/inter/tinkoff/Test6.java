package inter.tinkoff;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        Integer[] ageArray;
        try {
            String age = "29";
            ageArray = new Integer[]{Integer.parseInt(age)};
        } catch (NumberFormatException e){
            System.out.println("error");
        }
//        System.out.println(Arrays.toString(ageArray));
    }
}
