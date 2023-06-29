package leetcode;

import java.util.BitSet;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        BitSet set = new BitSet(10001);
        for (int i : nums){
            set.set(i);
        }
        return set.nextClearBit(0);
    }
}
