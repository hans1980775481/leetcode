package GuessNumberHigherOrLower.cpsky;

/**
 * \* Author: sky
 * \* Date: 2019/6/19
 * \* Description:
 * \
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(guessNumber(9909));
    }
    public static int guess(int number) {
        int n = 6;
        if (number < n) {
            return -1;
        } else if (number > n) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            int res = guess(mid);
            if (res == 0)
                return mid;
            else if (res < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}