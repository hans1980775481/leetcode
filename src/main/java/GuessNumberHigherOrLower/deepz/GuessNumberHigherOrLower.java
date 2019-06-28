package GuessNumberHigherOrLower.deepz;

/**
 * @author DeepSleeping
 * @date 2019/6/25 21:56
 * @description
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Guess Number Higher or Lower.
 * Memory Usage: 33 MB, less than 100.00% of Java online submissions for Guess Number Higher or Lower.
 */
public class GuessNumberHigherOrLower {

    int myNumber = 5;

    public int guessNumber(int n) {

        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int compareResult = guess(mid);
            if (compareResult == -1) {
                right = mid;
            } else if (compareResult == 0) {
                return mid;
            } else {
                left = mid + 1;
            }
        }


        return left;
    }

    int guess(int num) {
        if (num > myNumber) {
            return -1;
        } else if (num == myNumber) {
            return 0;
        } else {
            return 1;

        }
    }
}
