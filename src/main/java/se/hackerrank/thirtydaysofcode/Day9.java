package se.hackerrank.thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day9 {
    public static void main(String... args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            System.out.println(factorial(n));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    private static int factorial(int n){
        if (n==0||n==1) return 1;
        else return n*factorial(n-1);
    }
}
