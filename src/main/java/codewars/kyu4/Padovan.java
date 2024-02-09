package codewars.kyu4;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Padovan {
    public static void main(String[] args) {
        System.out.println(Get(1000000));
    }

    public static BigInteger Get(long power) {
        power += 4;
        BigInteger[][] qMatrix = new BigInteger[][]{
                new BigInteger[]{BigInteger.ZERO, BigInteger.ZERO, BigInteger.ONE},
                new BigInteger[]{BigInteger.ONE, BigInteger.ZERO, BigInteger.ONE},
                new BigInteger[]{BigInteger.ZERO, BigInteger.ONE, BigInteger.ZERO}
        };
        BigInteger[][] matrix = new BigInteger[][]{
                new BigInteger[]{BigInteger.ZERO, BigInteger.ZERO, BigInteger.ONE},
                new BigInteger[]{BigInteger.ONE, BigInteger.ZERO, BigInteger.ONE},
                new BigInteger[]{BigInteger.ZERO, BigInteger.ONE, BigInteger.ZERO}
        };
        for (int i = 0; i < power; i++) {
            matrix = multiplyMatrices(qMatrix, matrix);
        }
        return matrix[0][0];
    }

    private static BigInteger[][] multiplyMatrices(BigInteger[][] firstMatrix, BigInteger[][] secondMatrix) {
        BigInteger[][] result = new BigInteger[firstMatrix.length][secondMatrix[0].length];
        int[][] indexes = new int[][]{
                new int[]{0, 0},
                new int[]{0, 1},
                new int[]{0, 2},
                new int[]{1, 0},
                new int[]{1, 1},
                new int[]{1, 2},
                new int[]{2, 0},
                new int[]{2, 1},
                new int[]{2, 2},
        };
        Arrays.stream(indexes).parallel().forEach(i -> result[i[0]][i[1]] = multiplyMatricesCell(firstMatrix, secondMatrix, i[0], i[1]));
        return result;
    }

    private static BigInteger multiplyMatricesCell(BigInteger[][] firstMatrix, BigInteger[][] secondMatrix, int row, int col) {
        return IntStream.rangeClosed(0,2).parallel().mapToObj(i->BigInteger.ZERO.add(firstMatrix[row][i].multiply(secondMatrix[i][col]))).reduce(BigInteger::add).get();
    }
}
