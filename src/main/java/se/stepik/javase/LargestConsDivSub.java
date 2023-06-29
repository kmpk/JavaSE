package se.stepik.javase;

import java.util.HashSet;

public class LargestConsDivSub {
    public static void main(String[] args) {
        // Returns length of the longest consecutive subsequence
    }

    static int findLongestConseqSubseq(int[] arr) {
        HashSet<Integer> S = new HashSet<Integer>();
        int n = arr.length;
        int ans = 0;

        // Hash all the array elements
        for (int i = 0; i < n; ++i)
            S.add(arr[i]);

        // check each possible sequence from the start
        // then update optimal length
        for (int i = 0; i < n; ++i) {
            // if current element is the starting
            // element of a sequence
            if (!S.contains(arr[i] - 1)) {
                // Then check for next elements in the
                // sequence
                int j = arr[i];
                while (S.contains(j))
                    j++;

                // update  optimal length if this length
                // is more
                if (ans < j - arr[i])
                    ans = j - arr[i];
            }
        }
        return ans;
    }
}
