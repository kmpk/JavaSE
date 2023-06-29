package leetcode;

import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int current = 0;
        boolean indexStillCorrect = true;
        while (indexStillCorrect) {
            int currentTarget = current + 1;
            int targetCount = 0;
            for (int i = citations.length - 1; i >= 0; i--) {
                if (citations[i]>=currentTarget){
                    targetCount++;
                } else {
                    break;
                }
            }
            indexStillCorrect = currentTarget <= targetCount;
            if (indexStillCorrect) {
                current = currentTarget;
            }
        }
        return current;
    }
}
