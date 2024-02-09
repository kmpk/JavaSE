package codewars.kyu3;

import java.util.HashMap;
import java.util.Map;

public class BattleshipField {
    public static boolean fieldValidator(int[][] field) {
        Map<Types, Integer> shipsMap = initializeShipMap();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (field[i][j] == 1) {
                    Types ship = checkShip(field, i, j);
                    if (ship == null) return false;
                    else shipsMap.merge(ship, -1, Integer::sum);
                }
            }
        }
        return shipsMap.values().stream().noneMatch(i -> i != 0);
    }

    private static Types checkShip(int[][] array, int i, int j) {
        int[] is = {i, i, i, i};
        int[] js = {j, j, j, j};
        int count = 0;
        array[i][j] = -2;
        count++;
        is[0] = i;
        js[0] = j;
        int orientation = getShipOrientation(array, i, j);
        if (orientation == -1) {
            int up = 1;
            int down = 1;
            while (true) {
                if (i - up > -1 && array[i - up][j] == 1) {
                    array[i - up][j] = -2;
                    is[count] = i - up;
                    up++;
                    count++;
                }
                if (i + down < 10 && array[i + down][j] == 1) {
                    array[i + down][j] = -2;
                    is[count] = i + up;
                    down++;
                    count++;
                }
                if ((i - up < 0 || array[i - up][j] == 0) &&
                        (i + down > 9 || array[i + down][j] == 0)) {
                    break;
                }
            }
        } else {
            int left = 1;
            int right = 1;
            while (true) {
                if (j - left > -1 && array[i][j - left] == 1) {
                    array[i][j - left] = -2;
                    js[count] = j - left;
                    left++;
                    count++;
                }
                if (j + right < 10 && array[i][j + right] == 1) {
                    array[i][j + right] = -2;
                    js[count] = j + right;
                    right++;
                    count++;
                }
                if (j - left < 0 || array[i][j - left] != 1 && j + right > 9 || array[i][j + right] != 1) {
                    break;
                }
            }
        }
        for (int a = 0; a < 4; a++) {
            if (!checkCell(array, is[a], js[a])) return null;
        }
        for (int a = 0; a < 4; a++) {
            array[is[a]][js[a]] = 2;
        }
        switch (count) {
            case 1:
                return Types.SINGLE;
            case 2:
                return Types.DOUBLE;
            case 3:
                return Types.TRIPLE;
            case 4:
                return Types.QUAD;
            default:
                return null;
        }


    }

    //-1 - vertical i+++
    //+1 - horizontal j+++
    //0 - SINGLE ship
    private static int getShipOrientation(int[][] array, int i, int j) {
        if (i > 0) {
            if (i < 9) if (array[i - 1][j] == 1 || array[i + 1][j] == 1) return -1;
            else if (array[i - 1][j] == 1) return -1;
        } else if (array[i + 1][j] == 1) return -1;
        if (j > 0) {
            if (j < 9) if (array[i][j - 1] > 0 || array[i][j + 1] > 0) return 1;
            else if (array[i][j - 1] == 1) return 1;
        } else if (array[i][j + 1] == 1) return 1;
        return 0;
    }

    //false if there is overlap or contact by corner
    private static boolean checkCell(int[][] array, int i, int j) {
        if (i > 0 && j > 0 && i < 9 && j < 9) {
            if (
                    array[i - 1][j - 1] > 0 ||
                            array[i - 1][j] > 0 ||
                            array[i - 1][j + 1] > 0 ||

                            array[i][j - 1] > 0 ||
                            array[i][j + 1] > 0 ||

                            array[i + 1][j - 1] > 0 ||
                            array[i + 1][j] > 0 ||
                            array[i + 1][j + 1] > 0) return false;
        } else if (i == 0 && j == 0) {
            if (
                    array[i][j + 1] > 0 ||
                            array[i + 1][j] > 0 ||
                            array[i + 1][j + 1] > 0) return false;
        } else if (i == 0 && j == 9) {
            if (
                    array[i][j - 1] > 0 ||
                            array[i + 1][j - 1] > 0 ||
                            array[i + 1][j] > 0) return false;
        } else if (i == 9 && j == 0) {
            if (
                    array[i][j + 1] > 0 ||
                            array[i - 1][j] > 0 ||
                            array[i - 1][j + 1] > 0) return false;
        } else if (i == 9 && j == 9) {
            if (
                    array[i][j - 1] > 0 ||
                            array[i - 1][j - 1] > 0 ||
                            array[i - 1][j] > 0) return false;
        } else if (i == 0) {
            if (
                    array[i][j - 1] > 0 ||
                            array[i][j + 1] > 0 ||
                            array[i + 1][j - 1] > 0 ||
                            array[i + 1][j] > 0 ||
                            array[i + 1][j + 1] > 0) return false;
        } else if (i == 9) {
            if (
                    array[i - 1][j - 1] > 0 ||
                            array[i - 1][j] > 0 ||
                            array[i - 1][j + 1] > 0 ||
                            array[i][j - 1] > 0 ||
                            array[i][j + 1] > 0) return false;
        } else if (j == 0) {
            if (
                    array[i - 1][j] > 0 ||
                            array[i - 1][j + 1] > 0 ||

                            array[i][j + 1] > 0 ||

                            array[i + 1][j] > 0 ||
                            array[i + 1][j + 1] > 0) return false;
        } else if (j == 9) {
            if (array[i - 1][j - 1] > 0 ||
                    array[i - 1][j] > 0 ||

                    array[i][j - 1] > 0 ||

                    array[i + 1][j - 1] > 0 ||
                    array[i + 1][j] > 0) return false;
        }
        return true;
    }

    private static Map<Types, Integer> initializeShipMap() {
        Map<Types, Integer> result = new HashMap<>();
        result.put(Types.SINGLE, 4);
        result.put(Types.DOUBLE, 3);
        result.put(Types.TRIPLE, 2);
        result.put(Types.QUAD, 1);
        return result;
    }
}

enum Types {
    SINGLE, DOUBLE, TRIPLE, QUAD
}
