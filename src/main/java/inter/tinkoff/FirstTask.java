package inter.tinkoff;

import java.io.IOException;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FirstTask {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            int revolversCount = scanner.nextInt();
            int moneyAmount = scanner.nextInt();
            System.out.println(chooseRevolverCost(moneyAmount, scanner.tokens().limit(revolversCount).mapToInt(Integer::parseInt)));
        }
    }


    static int chooseRevolverCost(int moneyAmount, IntStream revolvers) {
        int result = 0;

        PrimitiveIterator.OfInt iterator = revolvers.iterator();
        while (iterator.hasNext() && result != moneyAmount) {
            int currentRevolverCost = iterator.nextInt();
            if (currentRevolverCost <= moneyAmount) {
                result = (Math.max(result, currentRevolverCost));
            }
        }

        return result;
    }
}
