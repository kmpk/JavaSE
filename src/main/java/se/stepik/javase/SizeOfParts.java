package se.stepik.javase;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SizeOfParts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = IntStream
                .range(0, n)
                .map(i -> sc.nextInt())
                .boxed()
                .collect(Collectors.toMap(i -> i, i -> 1, Integer::sum));
        System.out.printf("%d %d %d",
                map.getOrDefault(0, 0),
                map.getOrDefault(1, 0),
                map.getOrDefault(-1, 0));
        sc.close();
    }
}
