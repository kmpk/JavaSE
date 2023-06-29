package se.codewars.kyu4;

import java.util.ArrayList;
import java.util.List;

public class Finder {
    static boolean pathFinder(String maze) {
        int[][] array = buildArray(maze);

        return false;
    }

    private static int[][] buildArray(String maze) {
        char[] charArray = maze.toCharArray();
        int linesCount = (int) maze.chars().mapToObj(i -> (char) i).filter(i -> i == '\n').count() + 1;
        List<Character> charList = new ArrayList<Character>();
        for (char c : charArray) {
            charList.add(c);
        }
        while (charList.contains('\n')) {
            charList.remove((Character) '\n');
        }
        int[][] resultArray = new int[linesCount][linesCount];
        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < linesCount; j++) {
                char c = charList.get(linesCount * i + j);
                switch (c) {
                    case '.': {
                        resultArray[i][j] = -1;
                        break;
                    }
                    case 'W': {
                        resultArray[i][j] = -2;
                        break;
                    }
                }
            }
        }
        return resultArray;
    }

    private static boolean customWaveAlg(int[][] map){
        return true;
    }
}
