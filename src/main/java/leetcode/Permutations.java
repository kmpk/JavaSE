package leetcode;

import java.util.*;

public class Permutations {
    private Set<Integer> set = new HashSet<>();
    private int[] nums;

    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        set.clear();
        for (int num : nums) {
            set.add(num);
        }
        List<List<Integer>> result = new ArrayList<>();
        permute(null, result);
        return result;
    }

    private void permute(LinkedHashSet<Integer> current, List<List<Integer>> result) {
        if (current == null) {
            for (int i : nums) {
                LinkedHashSet<Integer> cur = new LinkedHashSet<>();
                cur.add(i);
                set.remove(i);
                permute(cur, result);
            }
            return;
        }
        if (set.isEmpty()) {
            result.add(new ArrayList<>(current));
            set.addAll(current);
        } else {
            for (int num : nums) {
                if (!current.contains(num)) {
                    current.add(num);
                    set.remove(num);
                }
            }
        }

    }
}
