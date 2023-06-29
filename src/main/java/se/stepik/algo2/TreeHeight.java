package se.stepik.algo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TreeHeight {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            while (true)
                System.out.println(getHeight(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getHeight(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int hops = 1;
            int current = i;
            while (true) {
                if (array[current] == -1) {
                    break;
                } else {
                    current = array[current];
                    hops++;
                }
            }
            max = hops > max ? hops : max;
        }
        return max;
    }
}

