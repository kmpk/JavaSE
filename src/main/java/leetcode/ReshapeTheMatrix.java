package leetcode;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length) {
            return mat;
        }
        int[][] result = new int[r][c];
        int x = 0;
        int y = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result[x][y] = mat[i][j];
                y++;
                if (y == c) {
                    y = 0;
                    x++;
                }
            }
        }
        return result;
    }
}
