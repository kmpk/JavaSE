package se.stepik.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Intersections {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int dots, sections;
            String[] input = br.readLine().split(" ");
            dots = Integer.parseInt(input[1]);
            sections = Integer.parseInt(input[0]);
            SectionStorage ss = new SectionStorage();
            for (int i = 0; i < sections; i++) {
                ss.addSection(br.readLine());
            }
            ss.sort();
            StringBuilder sb = new StringBuilder();
            Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).forEach(i -> sb.append(ss.getIntersections(i)).append(" "));
            System.out.println(sb.toString().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SectionStorage {
    private final List<MySection> leftDots, rightDots;

    public SectionStorage() {
        leftDots = new ArrayList<>();
        rightDots = new ArrayList<>();
    }

    public void addSection(String s) {
        MySection m = MySection.fromString(s);
        leftDots.add(m);
        rightDots.add(m);
    }

    public void sort() {
        leftDots.sort(Comparator.comparingInt(MySection::getLeftDot));
        rightDots.sort(Comparator.comparingInt(MySection::getRightDot));
    }

    public int getIntersections(int dot) {
        int left = biSearch(leftDots, dot, Comparator.comparingInt(MySection::getLeftDot));
        int right = biSearch(rightDots, dot, Comparator.comparingInt(MySection::getRightDot));

        if (leftDots.get(left).getLeftDot() > dot) {
            while (true) {
                left--;
                if (left == -1) {
                    break;
                }
                if (leftDots.get(left).getLeftDot() <= dot) {
                    break;
                }
            }
        } else {
            while (true) {
                left++;
                if (left >= leftDots.size()) {
                    break;
                }
                if (leftDots.get(left).getLeftDot() > dot) {
                    left--;
                    break;
                }
                if (leftDots.get(left).getLeftDot() <= dot && left == leftDots.size() - 1) {
                    break;
                }
            }
        }
        if (rightDots.get(right).getRightDot() >= dot) {
            while (true) {
                right--;
                if (right == -1) {
                    break;
                }
                if (rightDots.get(right).getRightDot() < dot) {
                    break;
                }
            }
        } else {
            while (true) {
                right++;
                if (right >= leftDots.size()) {
                    break;
                }
                if (rightDots.get(right).getRightDot() >= dot) {
                    right--;
                    break;
                }
                if (rightDots.get(right).getRightDot() < dot && right == rightDots.size() - 1) {
                    break;
                }
            }
        }
        if (left == leftDots.size()) {
            return rightDots.size() - 1 - right;
        }
        if (right == rightDots.size()) {
            return 0;
        }
        return left - right;
    }

    private static int biSearch(List<MySection> list, int k, Comparator<MySection> comparator) {
        MySection sec = new MySection(k, k);
        int l = 0;
        int r = list.size() - 1;
        int m = 0;
        while (l < r) {
            m = (l + r) / 2;
            if (comparator.compare(list.get(m), sec) == 0) return m;
            else if (comparator.compare(list.get(m), sec) > 0) r = m - 1;
            else l = m + 1;
        }
        return m;
    }
}

class MySection {
    private final int a, b;

    public static MySection fromString(String s) {
        String[] array = s.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        return new MySection(a, b);
    }

    public MySection(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getRightDot() {
        return b;
    }

    public int getLeftDot() {
        return a;
    }
}
