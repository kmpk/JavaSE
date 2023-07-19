package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return Collections.emptyList();
        }
        if (nums.length == 1) {
            return List.of("" + nums[0]);
        }
        List<String> result = new ArrayList<>();
        int start = nums[0];
        int end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            if (current == end + 1) {
                end++;
            } else {
                result.add(getRangeString(start, end));
                start = current;
                end = current;
            }
        }
        result.add(getRangeString(start, end));
        return result;
    }

    private String getRangeString(int start, int end) {
        return start == end ? String.valueOf(start) : start + "->" + end;
    }
}
