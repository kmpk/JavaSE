package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        return checklines(board) && checkColumns(board) && checkBoxes(board);
    }

    private boolean checklines(char[][] sudoku) {
        Set<Character> set = new HashSet<>();
        for (char[] line : sudoku) {
            for (char c : line) {
                if (c != '.' && !set.add(c)) {
                    return false;
                }
            }
            set.clear();
        }
        return true;
    }

    private boolean checkColumns(char[][] sudoku) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = sudoku[j][i];
                if (c != '.' && !set.add(c)) {
                    return false;
                }
            }
            set.clear();
        }
        return true;
    }

    private boolean checkBoxes(char[][] sudoku) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                for (int ii = i; ii < i + 3; ii++) {
                    for (int jj = j; jj < j + 3; jj++) {
                        char c = sudoku[ii][jj];
                        if (c != '.' && !set.add(c)) {
                            return false;
                        }
                    }
                }
                set.clear();
            }
        }
        return true;
    }
}
