package se.hackerrank.interview.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxToys {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");
            int cash = Integer.parseInt(input[1]);
            input = br.readLine().split(" ");
            int[] toys = new int[input.length];
            for (int i = 0; i < toys.length; i++) {
                toys[i] = Integer.parseInt(input[i]);
            }
            Arrays.sort(toys);
            int counter =0;
            int result =0;
            while (true){
                cash-=toys[counter];
                if (cash>=0){
                    counter++;
                    result++;
                } else break;
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
