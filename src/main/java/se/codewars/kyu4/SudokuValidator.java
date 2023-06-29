package se.codewars.kyu4;

import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        return checklines(sudoku) && checkColumns(sudoku) && checkBoxes(sudoku);
    }

    private static boolean checklines(int[][] sudoku) {
        Set<Integer> set = new HashSet<>();
        for (int[] line : sudoku) {
            for (int i : line) {
                if (i == 0) {
                    return false;
                } else {
                    set.add(i);
                }
            }
            if (set.size() != 9) {
                return false;
            }
            set.clear();
        }
        return true;
    }

    private static boolean checkColumns(int[][] sudoku) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int digit = sudoku[i][j];
                if (digit == 0) {
                    return false;
                } else {
                    set.add(digit);
                }
            }
            if (set.size() != 9) {
                return false;
            }
            set.clear();
        }
        return true;
    }

    private static boolean checkBoxes(int[][] sudoku) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                for (int ii = i; ii < i + 3; ii++) {
                    for (int jj = j; jj < j + 3; jj++) {
                        int digit = sudoku[ii][jj];
                        if (digit == 0) {
                            return false;
                        } else {
                            set.add(digit);
                        }
                    }
                }
                if (set.size() != 9) {
                    return false;
                }
                set.clear();
            }
        }
        return true;
    }
}
