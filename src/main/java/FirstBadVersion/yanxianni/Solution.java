package FirstBadVersion.yanxianni;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author WangChenYao
 * @Date 2019/6/22 13:12
 * @Version 1.0
 */
public class Solution {
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        while (low < high) {
            //此处可以使用mid=(low+high)/2，当low和high较大时，之和会溢出，故采用下方的
            //且使用了位运算，进行优化。
            int mid = low + ((high - low) >> 1);
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }
}
