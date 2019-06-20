package FirstBadVersion.xiaokenzhanwei;

/**
 * @author 小坑占位 create date by 2019/6/19 14:02
 */
public class Solution extends VersionControl {

    public Solution(int firsBadVersion) {
        super(firsBadVersion);
    }

    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        while (left < right){
            int mid = left + (right - left)/2;
            if (isBadVersion(mid)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
       return left;
    }



}