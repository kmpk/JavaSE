package se.stepik.javase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BinaryOperator;
import java.util.stream.LongStream;

public class RangeProduction {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");
            long a = Long.parseLong(input[0]);
            long b = Long.parseLong(input[1]);
            BinaryOperator<Long> bo = prodOfRange();
            System.out.println(bo.apply(a,b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static BinaryOperator<Long> prodOfRange() {
        return (Long x, Long y) -> LongStream.rangeClosed(x, y).reduce(1, (a, b) -> a * b);
    }
}

