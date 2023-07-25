package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
    private int[][] matrix;
    private Set<Integer> affectedRows;
    private Set<Integer> affectedColumns;

    public void setZeroes(int[][] matrix) {
        this.matrix = matrix;
        this.affectedRows = new HashSet<>();
        this.affectedColumns = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    affectedRows.add(i);
                    affectedColumns.add(j);
                }
            }
        }

        for (int i : affectedRows) {
            setRowZeroes(i);
        }
        for (int i : affectedColumns) {
            setColumnZeroes(i);
        }
    }

    private void setRowZeroes(int j) {
        for (int i = 0; i < matrix[j].length; i++) {
            matrix[j][i] = 0;
        }
    }

    private void setColumnZeroes(int j) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][j] = 0;
        }
    }
}
