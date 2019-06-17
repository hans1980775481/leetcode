package GuessNumberHigherOrLower.ZHANGJIKAI5;

/**
 * author：ZHANGJIKAI5
 * 题目：374. Guess Number Higher or Lower
 * 解题思路：二分查找
 */
public class GuessNumberHigherorLower extends GuessGame {

    /**
     * 第一次执行：
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Guess Number Higher or Lower.
     * Memory Usage: 32.8 MB, less than 100.00% of Java online submissions for Guess Number Higher or Lower.
     */
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left)/2;
            int guess = guess(mid);
            if (guess == 1) {
                left = mid + 1;
            } else if (guess == -1) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        GuessNumberHigherorLower guessNumberHigherorLower = new GuessNumberHigherorLower();
        int i = guessNumberHigherorLower.guessNumber(10);
        System.out.println(i);
    }

}
