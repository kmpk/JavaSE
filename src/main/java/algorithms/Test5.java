package algorithms;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String out = "";
            if (i % 3 == 0) {
                out += "fizz";
            }
            if (i % 5 == 0) {
                out += "buzz";
            }
            if (out.isEmpty()) {
                out += i;
            }
            System.out.println(out);
        }
    }
}
