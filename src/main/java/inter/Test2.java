package inter;

public class Test2 {
    public static int wordsCount(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int counter = 1;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                counter++;
            }
        }
        return counter;
    }
}
