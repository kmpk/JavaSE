package inter.tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SecondTask {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = reader.readLine();
            System.out.println(countSheriffs(input));
        }
    }

    private static final Set<Character> letters = Set.of('s', 'h', 'e', 'r', 'i', 'f');

    static int countSheriffs(String input) {
        Map<Character, Integer> charsMap = new HashMap<>();
        input.chars()
                .filter(i -> letters.contains((char) i))
                .forEach(i -> charsMap.merge((char) i, 1, Integer::sum));
        charsMap.merge('f', 2, (i1, i2) -> i1 / i2);
        return charsMap.values().stream()
                .mapToInt(i -> i)
                .min()
                .orElse(0);
    }
}
