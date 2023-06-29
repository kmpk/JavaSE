package se.hackerrank.interview.greedalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LuckBalance {
    public static void main(String... args) {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            String[] inputString = bf.readLine().split(" ");
            int result = 0;
            int n = Integer.parseInt(inputString[0]);
            int k = Integer.parseInt(inputString[1]);
            List<Integer> importantContestList = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                inputString = bf.readLine().split(" ");
                if (inputString[1].equals("0")) result += Integer.parseInt(inputString[0]);
                else importantContestList.add(Integer.parseInt(inputString[0]));
            }
            importantContestList.sort(Comparator.reverseOrder());
            for (int i : importantContestList) {
                if (k > 0) {
                    result += i;
                    k--;
                } else {
                    result -= i;
                }
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
