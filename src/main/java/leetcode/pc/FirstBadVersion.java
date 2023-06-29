package leetcode.pc;

import java.util.function.Function;

//https://leetcode.com/problems/first-bad-version/
public class FirstBadVersion {
    int badVersion = 0;

    public int getBadVersion() {
        return badVersion;
    }

    public void setBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    public int firstBadVersion(int n) {
        int result = n;
        int left = 1;
        int right = n;
        while (left < right) {
            int middle = left + (right - left) / 2;
            boolean isBadVersion = isBadVersion(middle);
            if (isBadVersion) {
                result = middle;
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return result;
    }


    private boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
