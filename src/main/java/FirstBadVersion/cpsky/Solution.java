package FirstBadVersion.cpsky;

/**
 * \* Author: sky
 * \* Date: 2019/6/19
 * \* Description:
 * \
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(2));
    }
    public static boolean isBadVersion(int version) {
        if (version >= 2 ){
            return true;
        }
        return false;
    }
    public static int firstBadVersion(int n) {
        int res = 0;
        int low = 1, high = n;
        while (low <= high) {
            int mid = (low + high) / 2 ;
            if (isBadVersion(mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}