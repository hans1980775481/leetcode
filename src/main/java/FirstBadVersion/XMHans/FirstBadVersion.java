package FirstBadVersion.XMHans;

/**
 * link: https://leetcode.com/problems/first-bad-version/
 */
public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = (right-left)/2 + left;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;

    }
}
class VersionControl {
    // 题目给的一个API, 里面的算法被隐藏了
    boolean isBadVersion(int version){ return true;}
}
