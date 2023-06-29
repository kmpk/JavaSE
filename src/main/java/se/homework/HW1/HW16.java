package se.homework.HW1;

import java.util.Random;

public class HW16 {
    public static void main(String[] args) {
        int first, second;
        Random r = new Random();
        for (int i = 0; i < 25; i++){
            first = r.nextInt();
            second = r.nextInt();
            if (first-second>0) {
                System.out.println("больше");
            } else if(first-second<0){
                System.out.println("меньше");
            } else System.out.println("равно");
        }
    }
}
