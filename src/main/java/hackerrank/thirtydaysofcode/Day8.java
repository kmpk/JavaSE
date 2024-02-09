package hackerrank.thirtydaysofcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            phoneBook.put(in.next(), in.nextInt());
        }
        while (in.hasNext()) {
            String s = in.next();
            int phone = phoneBook.getOrDefault(s, 0);
            if (phone != 0) System.out.println(s + "=" + phone);
            else System.out.println("Not found");
        }
        in.close();
    }
}

