package se.stepik.javase;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            IntStream.rangeClosed(a, b).forEach(value -> {
                StringBuilder sb = new StringBuilder();
                if (value % 3 == 0 || value % 5 == 0) {
                    if (value % 3 == 0)
                        sb.append("Fizz");
                    if (value % 5 == 0)
                        sb.append("Buzz");
                } else {
                    sb.append(value);
                }
                System.out.println(sb.append("\n"));
            });
        }
    }
}
