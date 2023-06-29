package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int l = 1; l <= numRows; l++) {
            int j = 1;
            result.add(new ArrayList<>());
            for (int i = 1; i <= l; i++) {
                result.get(l - 1).add(j);
                j = j * (l - i) / i;
            }
        }
        return result;
    }
}
