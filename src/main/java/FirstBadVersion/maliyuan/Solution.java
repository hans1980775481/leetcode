package FirstBadVersion.maliyuan;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int min = left + (right - left) / 2;
            if (isBadVersion(min)) {
                right = min;
            } else {
                left = min + 1;
            }
        }
        return left;
    }

}