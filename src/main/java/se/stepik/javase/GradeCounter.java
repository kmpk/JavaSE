package se.stepik.javase;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> gradesMap = new HashMap<>();
        int j = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < j; i++) {
            gradesMap.merge(Integer.parseInt(sc.nextLine()), 1, Integer::sum);
        }
        System.out.printf("%d %d %d %d"
                ,gradesMap.getOrDefault(2,0)
                ,gradesMap.getOrDefault(3,0)
                ,gradesMap.getOrDefault(4,0)
                ,gradesMap.getOrDefault(5,0));
    }
}
