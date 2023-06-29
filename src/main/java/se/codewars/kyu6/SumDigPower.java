package se.codewars.kyu6;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();
        for (long i = a; i<=b; i++){
            if (isSumDigPower(i)) result.add(i);
        }
        return result;
    }
    private static int[] getDigits(long number){
        long divider = 1;
        long temp = 0;
        int length = String.valueOf(number).length();
        int[] digits = new int[length];
        for(int i =1; i< length;i++)
        {
            divider = divider * 10;
        }
        int i =0;
        while (divider >0) {
            temp = number / divider;
            number = number % divider;
            digits[i]= (int) temp;
            i++;
            divider = divider/10;
        }
        return digits;
    }
    private static boolean isSumDigPower(long number){
        int[] digits = getDigits(number);
        long temp=0;
        for (int i =0; i<digits.length; i++){
            temp+=pow(digits[i],i+1);
        }
        return temp==number;
    }
    private static long pow(int digit, int power){
        if (power==0) return 1;
        long result=digit;
        for (int i = 1; i<power; i++){
            result*=digit;
        }
        return result;
    }
}
