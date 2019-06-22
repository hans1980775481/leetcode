package GuessNumberHigherOrLower.weiyien;

/**
 * @auther: 魏薏恩
 * @date: 2019/6/20 18:57
 * @description: 二分查找
 */
public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int left = 0;
        int right = n;
        int mid = 0;
        int guessRes = 0;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            guessRes = guess(mid);
            if (guessRes == 1) {
                left = mid + 1;
            } else if (guessRes == -1) {
                right = mid - 1;
            } else {
                break;
            }
        }
        return mid;
    }

    public int guess(int param) {
        if (param > 6) {
            return -1;
        } else if (param < 6) {
            return 1;
        }
        return 0;
    }

}
