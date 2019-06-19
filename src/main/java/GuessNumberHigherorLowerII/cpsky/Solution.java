package GuessNumberHigherorLowerII.cpsky;

/**
 * \* Author: sky
 * \* Date: 2019/6/19
 * \* Description:
 * \
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getMoneyAmount(99));
    }

    public static int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        return findDpMax(1, n, dp);
    }

    public static int findDpMax(int low, int high, int[][] dp) {
        if (low >= high) {
            return 0;
        }
        if (dp[low][high] != 0) {
            return dp[low][high];
        }
        dp[low][high] = Integer.MAX_VALUE;
        for (int i = low; i <= high; i++) {
            int left = findDpMax(low, i - 1, dp);
            int right = findDpMax(i + 1, high, dp);
            int temp = Math.max(left, right) + i;
            dp[low][high] = Math.min(temp, dp[low][high]);
        }
        System.out.println(low + "," + high + ":" + dp[low][high]);
        return dp[low][high];
    }
}