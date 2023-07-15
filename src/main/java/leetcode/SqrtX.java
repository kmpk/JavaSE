package leetcode;

public class SqrtX {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int i = 0;
        long c = 1;

        while (c * c < x) {
            c *= 2;
        }

        while (i * i < x && c != 0) {
            if ((i + c) * (i + c) <= x) {
                i += c;
            }
            c /= 2;
        }
        return i;
    }
}
