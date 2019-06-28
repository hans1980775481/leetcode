package FirstBadVersion.deepz;

/**
 * @author DeepSleeping
 * @date 2019/6/23 22:47
 * @description
 */
public class FirstBadVersion {

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean isBadVersion(int n) {

        return true;
    }
}

