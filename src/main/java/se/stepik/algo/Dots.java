package se.stepik.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dots {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long startTime = System.currentTimeMillis();
            List<Section> list = new ArrayList<>();
            int j = Integer.parseInt(br.readLine());
            for (int i = 0; i < j; i++) {
                list.add(Section.fromString(br.readLine()));
            }
            System.out.println(getResult(list));
            //System.out.println(System.currentTimeMillis() - startTime + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getResult(List<Section> list) {
        list.sort(Comparator.comparingInt(Section::getSecondDot));
        List<Integer> dotsList = new ArrayList<>();
        int current = -1;
        for (Section s : list) {
            if (!s.checkIntersection(current)) {
                current = s.getSecondDot();
                dotsList.add(current);
            }
        }
        StringBuilder s = new StringBuilder(dotsList.size() + "").append("\n");
        for (Integer i : dotsList) {
            s.append(i).append(" ");
        }
        s.lastIndexOf(" ");
        return s.toString();
    }
}

class Section {
    private final int a, b;

    public static Section fromString(String s) {
        String[] array = s.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        return new Section(a, b);
    }

    private Section(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSecondDot() {
        return b;
    }

    public boolean checkIntersection(int dot) {
        return (a <= dot && b >= dot);
    }
}