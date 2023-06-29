package se.codewars.kyu3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RailFenceCipher {
    static String encode(String s, int n) {
        List<StringBuilder> rails = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rails.add(new StringBuilder());
        }

        int i = 0;
        boolean isGoingUp = false;
        for (char c : s.toCharArray()) {
            rails.get(i).append(c);
            if (isGoingUp) {
                if (i == 0) {
                    isGoingUp = false;
                    i++;
                } else i--;
            } else {
                if (i == n - 1) {
                    isGoingUp = true;
                    i--;
                } else i++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (StringBuilder stringBuilder : rails) {
            sb.append(stringBuilder);
        }
        return sb.toString();
    }

    static String decode(String s, int n) {
        int[] railsLengths = new int[n];
        for (int i = 0; i < n; i++) {
            railsLengths[i] = 0;
        }

        int i = 0;
        boolean isGoingUp = false;
        for (int j = 0; j < s.length(); j++) {
            railsLengths[i] += 1;
            if (isGoingUp) {
                if (i == 0) {
                    isGoingUp = false;
                    i++;
                } else i--;
            } else {
                if (i == n - 1) {
                    isGoingUp = true;
                    i--;
                } else i++;
            }
        }

        int pos = 0;
        List<LinkedList<Character>> rails = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            String str = s.substring(pos, pos + railsLengths[j]);
            LinkedList<Character> rail = new LinkedList<>();
            for (char c : str.toCharArray()) {
                rail.add(c);
            }
            rails.add(rail);
            pos += railsLengths[j];
        }
        StringBuilder result = new StringBuilder();

        i = 0;
        isGoingUp = false;
        for (int j = 0; j < s.length(); j++) {
            result.append(rails.get(i).poll());
            if (isGoingUp) {
                if (i == 0) {
                    isGoingUp = false;
                    i++;
                } else i--;
            } else {
                if (i == n - 1) {
                    isGoingUp = true;
                    i--;
                } else i++;
            }
        }

        return result.toString();
    }
}
