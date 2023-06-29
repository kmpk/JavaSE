package se.homework.HW1;

public class HW14 {

    public static void main(String[] args) {
        StringComparsion("a", "b");
        StringComparsion("a", "a");
        StringComparsion("c", "b");
    }

    private static void StringComparsion(String first, String second) {
        System.out.println(first == second);
        System.out.println(first.equals(second));
        System.out.println(first.compareTo(second));
        System.out.println(first.compareToIgnoreCase(second));
    }
}
