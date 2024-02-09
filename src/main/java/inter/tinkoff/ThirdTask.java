package inter.tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.readLine();
            int[] handCards = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] winCards = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.out.println(equalizeBySorting(handCards, winCards) ? "YES" : "NO");
        }
    }

    static boolean equalizeBySorting(int[] handCards, int[] winCards) {
        int l = -1;
        for (int i = 0; i < handCards.length; i++) {
            if (handCards[i]!=winCards[i]) {
                l = i;
                break;
            }
        }
        if (l == -1) {
            return true;
        }

        int r = -1;
        for (int i = handCards.length - 1; i >= 0; i--) {
            if (handCards[i]!=winCards[i]) {
                r = i;
                break;
            }
        }
        if (r == l) {
            return false;
        }

        Arrays.sort(handCards, l, r + 1);
        return Arrays.equals(handCards, winCards);
    }
}


