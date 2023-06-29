package se.codewars.kyu6;

public class DRoot {
    public static int digital_root(int n) {
        int result = 0;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return (result < 10) ? result : digital_root(result);
    }
}
