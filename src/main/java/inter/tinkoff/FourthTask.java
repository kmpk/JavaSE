package inter.tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FourthTask {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int requiredSum = Integer.parseInt(reader.readLine().split(" ")[0]);
            int[] bills = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            int[] billsCount = new int[bills.length];
            Arrays.fill(billsCount, 2);

            Map<Integer, Integer> resultBills = pickBills(requiredSum, 0, bills, billsCount, new HashMap<>());

            if (resultBills != null) {
                System.out.println(resultBills.values().stream().mapToInt(i -> i).sum());
                StringBuilder builder = new StringBuilder();
                for (Map.Entry<Integer, Integer> entry : resultBills.entrySet()) {
                    for (int i = 0; i < entry.getValue(); i++) {
                        builder.append(entry.getKey()).append(" ");
                    }
                }
                System.out.println(builder.deleteCharAt(builder.lastIndexOf(" ")));
            } else {
                System.out.println(-1);
            }
        }
    }

    static Map<Integer, Integer> pickBills(int sum, int index, int[] bills, int[] billsCount, Map<Integer, Integer> result) {
        if (sum == 0) {
            return result;
        }
        if (index >= bills.length) {
            return null;
        }
        int bill = bills[index];

        for (int i = billsCount[index]; i >= 0; i--) {
            int addedAmount = i * bill;
            if (addedAmount <= sum) {
                result.put(bill, i);
                Map<Integer, Integer> currentResult = pickBills(sum - addedAmount, index + 1, bills, billsCount, result);
                if (currentResult != null) {
                    return currentResult;
                }
                result.remove(bill);
            }
        }
        return null;
    }
}
