package FirstBadVersion.codeLove;

public class FirstBadVersion {
    public int firstBadVersion(int n){

        int left=1,right=n;

        while( left <= right ){
            int mid=left+ ( right-left )/2;//防止N足够大时right+left溢出
            if( isBadVersion(mid) ){
                right = mid - 1 ;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static boolean isBadVersion( int n ){
        return true;
    }
}
