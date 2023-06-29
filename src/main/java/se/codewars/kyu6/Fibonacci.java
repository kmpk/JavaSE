package se.codewars.kyu6;


public class Fibonacci {
    public static java.util.stream.IntStream stream(int a, int b) {
        return java.util.stream.Stream.iterate(new int[] {a,b}, currentPair->new int[]{currentPair[1],currentPair[0]+currentPair[1]}).mapToInt(output-> output[0]);
    }
}

