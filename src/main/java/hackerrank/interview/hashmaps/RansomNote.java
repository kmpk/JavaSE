package hackerrank.interview.hashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class RansomNote {
    public static void main(String... args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            bufferedReader.readLine();//ignore first;
            String[] input = bufferedReader.readLine().split(" ");
            HashMap<String, Integer> magazineMap = new HashMap<>();
            for (int i = 0; i < input.length; i++) {
                magazineMap.merge(input[i], 1, (x, y) -> x + y);
            }
            input = bufferedReader.readLine().split(" ");
            boolean flag = true;
            for (int i = 0; i < input.length; i++) {
                Integer wordCount = magazineMap.get(input[i]);
                if (wordCount == null || wordCount < 1) {
                    System.out.println("No");
                    flag = false;
                    break;
                } else {
                    magazineMap.put(input[i], wordCount - 1);
                }
            }
            if (flag) System.out.println("Yes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
