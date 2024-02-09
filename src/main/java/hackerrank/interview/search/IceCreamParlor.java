package hackerrank.interview.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class IceCreamParlor {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                int money = Integer.parseInt(br.readLine());
                br.readLine(); //ignore array length
                String[] input = br.readLine().split(" ");
                int[] prices = new int[input.length];
                for (int j = 0; j < input.length; j++) {
                    prices[j] = Integer.parseInt(input[j]);
                }
                System.out.println(getIds(money, prices));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getIds(int targetSum, int[] prices) {
        int result1 = 0, result2 = 0;
        HashMap<Integer, HashSet<Integer>> idMap = new HashMap<>();
        for (int i = 0; i < prices.length; i++) {
            int current = prices[i];
            HashSet<Integer> idSet;
            if (idMap.containsKey(current)) {
                idSet = idMap.get(current);
                idSet.add(i);
            } else {
                idSet = new HashSet<>();
                idSet.add(i);
            }
            idMap.put(current, idSet);
        }
        boolean flag = false;
        for (int i = 0; i < prices.length; i++) {
            int current = prices[i];
            int targetPrice = targetSum - current;
            if (idMap.containsKey(targetPrice)) {
                Set<Integer> set = idMap.get(targetPrice);
                if (set.size() > 1) {
                    Iterator<Integer> iterator = set.iterator();
                    result1 = iterator.next();
                    result2 = iterator.next();
                    flag = true;
                } else if (current!=targetPrice){
                    result1 = i;
                    result2 = set.iterator().next();
                    flag = true;
                }
            }
            if (flag) return (result1 > result2) ? ++result2 + " " + ++result1 : ++result1 + " " + ++result2;
        }
        return null;
    }
}
