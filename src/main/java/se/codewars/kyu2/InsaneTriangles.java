package se.codewars.kyu2;

import java.util.LinkedList;

public class InsaneTriangles {
    public static char triangle(final String row) {
        try {
            LinkedList<Character[]> rowsList = new LinkedList<>();
            for (int i = 0; i < row.length(); i++) {
                if (i == 0) {
                    Character[] array = new Character[row.length()];
                    for (int j = 0; j < row.length(); j++) {
                        array[j] = row.toCharArray()[j];
                    }
                    rowsList.add(array);
                } else
                    rowsList.add(new Character[row.length() - i]);
            }
            for (int i = 1; i < row.length(); i++) {
                Character[] array = rowsList.get(i);
                for (int j = 0; j < array.length; j++) {
                    array[j] = getColour(j, rowsList.get(i - 1));
                }
            }
            return rowsList.getLast()[0];
        } catch (Exception e) {
            e.printStackTrace();
            return '?';
        }
    }

    private static char getColour(int currentId, Character[] previousRow) throws Exception {
        char first = previousRow[currentId];
        char second = previousRow[currentId + 1];
        if (first == second) return first;
        else if (first == 'R' && second == 'G' || first == 'G' && second == 'R') return 'B';
        else if (first == 'B' && second == 'G' || first == 'G' && second == 'B') return 'R';
        else if (first == 'B' && second == 'R' || first == 'R' && second == 'B') return 'G';
        throw new Exception("Wrong colours : " + first + ", " + second);
    }
}
