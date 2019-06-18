package FirstBadVersion.Zntao;

public class FirstBadVersion extends VersionControl {

    // 默认是从左到右false --> true 找到第一个返回true的位置
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left < right) {
            int mid = left + (right-left)/2;
            if (isBadVersion(mid)){
                right = mid;
            }
            else {
                left = mid+1;
            }
        }

        return left;
    }


    private int test(int begin, int end){
        int tem = (begin + end)/2;
        if (isBadVersion(tem)){

        }

        return 0;
    }
}
