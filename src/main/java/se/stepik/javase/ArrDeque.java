package se.stepik.javase;

import java.util.ArrayDeque;
import java.util.stream.Stream;

public class ArrDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        Stream.of(2, 0, 1, 7).forEach(queue::push);
        System.out.println(queue);
    }
}
