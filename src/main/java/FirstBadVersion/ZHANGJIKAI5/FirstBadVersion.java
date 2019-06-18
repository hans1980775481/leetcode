package FirstBadVersion.ZHANGJIKAI5;

/**
 * author：ZHANGJIKAI5
 * 题目：278. First Bad Version
 * 解题思路：使用二分查找，由于int类型有最大值限制，取中间值的时候，先用最大减最小然后取平均值再加最小值
 */
public class FirstBadVersion extends VersionControl {

    /**
     * 第一次执行：
     * Runtime: 10 ms, faster than 99.71% of Java online submissions for First Bad Version.
     * Memory Usage: 33 MB, less than 100.00% of Java online submissions for First Bad Version.
     */
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = (left + (right - left)/2);
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

       public static void main(String[] args) {
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        int i = firstBadVersion.firstBadVersion(2126753390);
        System.out.println(i);
    }

}
