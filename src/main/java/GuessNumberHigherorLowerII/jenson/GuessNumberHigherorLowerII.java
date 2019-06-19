package GuessNumberHigherorLowerII.jenson;

/**
 * @author: zhousong
 * @data: 2019/6/19
 */
public class GuessNumberHigherorLowerII {

    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        return dp(dp, 1, n);
    }

    private int dp(int[][] dp, int start, int end) {
        if (start >= end) {
            return 0;
        }
        if (dp[start][end] != 0) {
            return dp[start][end];
        }

        int money = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            int tmp = i + Math.max(dp(dp, start, i - 1), dp(dp, i + 1, end));
            if (tmp < money) {
                money = tmp;
            }
        }

        dp[start][end] = money;
        return money;
    }
}
