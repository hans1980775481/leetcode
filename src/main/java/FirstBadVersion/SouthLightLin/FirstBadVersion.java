package FirstBadVersion.SouthLightLin;

/**
 * @author SouthLight-Lin on 2019/6/22
 */
public class FirstBadVersion {
    /**
     * 解题思路：
     *      首先想到的肯定是遍历，但是遍历太慢了，时间复杂度为O(n)
     *      所以可以采用二分法来查找，
     * 步骤：
     *      1、算出mid的中间元素，调用isBadVersion(mid)判断是否为true
     *      2、如果为isBadVersion（mid)为true，则继续向前找
     *          让l=l,r=mid-1
     *      3、如果isBadVersion(mid)为false，则向后找
     *          让l=mid+1,r=r
     *      4、直到isBadVersion(mid)为true && l==mid，返回该值
     */
    // 第一次做时写的代码（运行19ms） ....
    public int firstBadVersion(int n){
        if (n<=0){
            return 0;
        }
        // 左右两个指针
        int l=1, r=n;
        while (true){
            int mid = (r-l)/2+l;
            // 主要是这一步浪费了时间，
            // 完全可以将这一步去掉
            if (isBadVersion(mid) && l==mid){
                return mid;
            }
            // 如果当前版本是好的，则往后查找
            else if (!isBadVersion(mid)) {
                l = mid+1;
            }
            // 如果当前版本是坏的，并且l!=mid，则继续往前找
            else {
                r = mid;
            }
        }
    }

    /**
     * 步骤：
     *      1、算出mid的中间元素，调用isBadVersion(mid)判断是否为true
     *      2、如果为isBadVersion（mid)为true，则继续向前找
     *          让l=l,r=mid
     *      3、如果isBadVersion(mid)为false，则向后找
     *          让l=mid+1,r=r
     *      4、直到l==r，返回l
     */
    // 看了官方答案写出的代码，改善到10ms
//    public int firstBadVersion(int n){
//        if (n<=0){
//            return 0;
//        }
//        // 左右两个指针
//        int l=1, r=n;
//        while (l < r){
//            int mid = (r-l)/2+l;
//
//            // 如果当前版本是好的，则往后查找
//            if (!isBadVersion(mid)) {
//                l = mid+1;
//            }
//            // 如果当前版本是坏的，则继续往前找
//            else {
//                r = mid;
//            }
//        }
//        return l;
//    }

    /****** 官方标准答案  *****/
    public int findFirst(int n){
        int left = 1;
        int right = n;
        // 直到left==right
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



    public boolean isBadVersion(int mid){
        return mid>=1702766719;
    }

    public static void main(String[] args) {
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        System.out.println(firstBadVersion.firstBadVersion(2126753390));
    }
}
