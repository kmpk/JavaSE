package se.hackerrank.interview.greedalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxMin {
    public static void main(String... args) {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = new int[Integer.parseInt(bf.readLine())];
            int length = Integer.parseInt(bf.readLine());
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(bf.readLine());
            }
            Arrays.sort(array);
            int result = Integer.MAX_VALUE;
            for (int i = 0; i <= array.length - length; i++) {
                int currentUnfairness = array[i + length-1] - array[i];
                if (currentUnfairness < result) result = currentUnfairness;
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
