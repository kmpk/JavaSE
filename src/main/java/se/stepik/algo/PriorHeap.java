package se.stepik.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PriorHeap {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            MyPriorityQueue<Integer> pq = new MyPriorityQueue<>(true);
            for (int i = Integer.parseInt(br.readLine()); i > 0; i--) {
                String input = br.readLine();
                if (input.matches("Insert \\d+")) {
                    pq.insert(Integer.parseInt(input.split(" ")[1]));
                } else {
                    if (input.matches("\\d+")) {
                        pq.insert(Integer.parseInt(input));
                    } else {
                        System.out.println(pq.extract());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

