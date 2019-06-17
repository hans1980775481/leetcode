package GuessNumberHigherOrLower.jenson;

/**
 * @author: zhousong
 * @data: 2019/6/17
 */
public class GuessNumberHigherorLower {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int ans = guess(mid);
            if (ans == 0) {
                return mid;
            } else if (ans == 1) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int guess(int num) {
        return 0;
    }
}
