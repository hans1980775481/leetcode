package FirstBadVersion.AzusaMutan;

public class FirstBadVersion {
    private boolean isBadVersion(int mid) {
        return true;
    }

    public int firstBadVersion(int n) {
        int ans = f(1,n);
        return ans;
    }

    public int f(long begin, long end) {
        long sum = begin + end;
        sum = sum / 2;
        int mid = (int)(sum);
        if (begin == end) return (int)end;
        else {
            if (isBadVersion(mid)) {
                if(mid == 1) return mid;
                if(isBadVersion(mid-1)) {
                    return f(begin, mid);
                }
                return mid;
            } else {
                if (mid == begin) return f(begin+1,end);
                else return f(mid, end);
            }
        }
    }
}
