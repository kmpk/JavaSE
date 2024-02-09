package codewars.kyu6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] A) {
        Map<Integer, Integer> numbersMap = new HashMap<>();
        Arrays.stream(A).forEach(i -> numbersMap.merge(i, 1, Integer::sum));
        for (Map.Entry<Integer, Integer> e : numbersMap.entrySet()) {
            if (e.getValue() % 2 == 1) {
                return e.getKey();
            }
        }
        return 0;
    }
}