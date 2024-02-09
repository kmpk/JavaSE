package hackerrank.interview.hashmaps;

import java.util.HashSet;
import java.util.Scanner;

public class TwoStrings {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            if (check(s1, s2)) System.out.println("YES");
            else System.out.println("NO");
        }
        scanner.close();
    }

    private static boolean check(String s1, String s2) {
        HashSet<Character> set = new HashSet<Character>();
        for (char c : s1.toCharArray()) {
            set.add(c);
        }
        for (char c : s2.toCharArray()) {
            if (set.contains(c)) return true;
        }
        return false;
    }
}
