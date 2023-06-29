package se.stepik.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Terms {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            List<Integer> list = getResult(n);
            StringBuilder sb = new StringBuilder().append(list.size()).append("\n");
            for (int i : list) {
                sb.append(i).append(" ");
            }
            System.out.println(sb.deleteCharAt(sb.lastIndexOf(" ")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> getResult(int n) {
        List<Integer> result = new ArrayList<>();
        int current = 0;
        int sum = 0;
        int rest = n;
        while (sum < n) {
            current++;
            rest -= current;
            if (rest <= current && rest != 0) {
                rest+=current;
            } else {
                sum += current;
                result.add(current);
            }
        }
        return result;
    }
}
