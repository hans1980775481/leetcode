package FirstBadVersion.mayuqingxx;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int a = 1;
        int b = n;
        while (a < b) {
            int mid = a+((b-a)/2);
            if (isBadVersion(mid)) {
                b = mid;
            } else {
                a =  mid + 1;
            }
        }
        return a;
    }

    boolean isBadVersion(int version) {
        if (version > 1233131) {
            return false;
        }
        return true;
    }
}
