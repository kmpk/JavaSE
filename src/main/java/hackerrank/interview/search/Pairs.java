package hackerrank.interview.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class Pairs {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int targetDiff = Integer.parseInt(br.readLine().split(" ")[1]);
            String[] input = br.readLine().split(" ");
            HashSet<Integer> origSet = new HashSet<>();
            HashSet<Integer> addedSet = new HashSet<>();
            for (String anInput : input) {
                int a = Integer.parseInt(anInput);
                origSet.add(a);
                addedSet.add(a + targetDiff);
            }
            int result = 0;
            Iterator<Integer> it = addedSet.iterator();
            while (it.hasNext()) {
                if (origSet.contains(it.next())) result++;
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
