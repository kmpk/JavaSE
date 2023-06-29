package se.hackerrank.thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day5 {
    public static void main(String... args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int input = Integer.parseInt(br.readLine());
            for (int i = 1; i<11; i++){
                System.out.printf("%d x %d = %d\n",input,i,i*input);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
