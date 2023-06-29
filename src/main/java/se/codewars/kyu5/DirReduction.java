package se.codewars.kyu5;

import java.util.*;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> directionsList = new LinkedList<>();
        directionsList.addAll(Arrays.asList(arr));
        ListIterator<String> iterator = directionsList.listIterator();
        String previous = null, current = null;
        while (iterator.hasNext()) {
            if (iterator.hasPrevious() && current == null) {
                current = iterator.previous();
                continue;
            } else {
                previous = current;
                current = iterator.next();
            }
            if (isOpposite(previous, current)) {
                iterator.previous();
                iterator.remove();
                iterator.previous();
                iterator.remove();
                previous = null;
                current = null;
                if (iterator.hasPrevious()) {
                }
            }
        }
        String[] result = new String[directionsList.size()];
        result = directionsList.toArray(result);
        return result;
    }

    private static boolean isOpposite(String previous, String current) {
        if (previous == null || current == null) return false;
        String[] directions = {"NORTH", "SOUTH", "EAST", "WEST"};
        return ((previous.equals(directions[0]) && current.equals(directions[1])) ||
                (previous.equals(directions[1]) && current.equals(directions[0])) ||
                (previous.equals(directions[2]) && current.equals(directions[3])) ||
                (previous.equals(directions[3]) && current.equals(directions[2])));
    }
}
