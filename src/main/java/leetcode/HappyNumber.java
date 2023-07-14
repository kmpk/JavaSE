package leetcode;

import java.util.HashMap;

public class HappyNumber {

    public static boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }
        if (n==1){
            return true;
        }

        long currentSum = 0;
        long num = n;

        HashMap<Long, Integer> previous = new HashMap<>();
        previous.put(num,1);

        while (currentSum != 1) {
            currentSum = 0;
            while (num > 0) {
                long digit = num % 10;
                num /= 10;
                currentSum += digit * digit;
            }
            num = currentSum;
            previous.merge(num,1,Integer::sum);
            if (previous.get(num)==2){
                return false;
            }
        }
        return true;
    }
}
