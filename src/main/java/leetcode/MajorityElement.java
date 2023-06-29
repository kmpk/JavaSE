package leetcode;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int frequency = 0;

        for (int i : nums){
            if (i==candidate){
                frequency++;
            } else {
                frequency--;
            }
            if (frequency<=0){
                candidate=i;
                frequency=1;
            }
        }
        return candidate;
    }
}
