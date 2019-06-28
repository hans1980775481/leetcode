package FirstBadVersion.weiyien;


/**
 * @auther: 魏薏恩
 * @date: 2019/6/20 18:43
 * @description: 二分查找 循环
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid = 0;
        while (left < right) {
            // left+right 可能会出现越界
            mid = left + ((right - left) >> 1);
            if (!isBadVersion(mid)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public boolean isBadVersion(int param) {
        return param > 1;
    }
}
