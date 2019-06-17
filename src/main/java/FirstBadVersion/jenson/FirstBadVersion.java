package FirstBadVersion.jenson;

/**
 * @author: zhousong
 * @data: 2019/6/17
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {

            // (left + right) / 2 会内存溢出
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int version) {
        return true;
    }
}
