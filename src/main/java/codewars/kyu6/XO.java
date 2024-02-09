package codewars.kyu6;

public class XO {
    public static boolean getXO(String str) {
        int xCount = 0;
        int oCount = 0;
        char[] xos = str.toCharArray();
        for (char c : xos) {
            if (c == 'x' || c == 'X') xCount++;
            if (c == 'o' || c == 'O') oCount++;
        }
        return xCount==oCount;
    }
}
