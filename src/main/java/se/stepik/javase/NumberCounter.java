package se.stepik.javase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> gradesMap = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        int result = 0;
        Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(i -> gradesMap.merge(i, 1, Integer::sum));
        for (Map.Entry<Integer, Integer> e : gradesMap.entrySet()) {
            if (e.getValue() > n / 2) {
                result = 1;
                break;
            }
        }
        System.out.println(result);
    }
}
