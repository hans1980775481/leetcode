package GuessNumberHigherorLowerII.SouthLight_Lin;

/**
 * LeetCode 375号题
 * 猜数，如果猜错了，就要支付$n的金额，求最少保证猜对的金额
 *
 * @author SouthLight-Lin on 2019/6/23
 */
public class GuessNumber2 {
    /**
     * 思路：
     *      这道题不能使用二分法来求解，因为是求最少的金额的情况，这道题可以使用动态规划或者递归的方式来做
     *      我们使用[1,2,3,4,5]来说明
     *      对于上面这5个数，我们可以从任何一个数开始猜，比如第一次猜1，第一次猜3，第一次猜2都可以
     *      这样的话第一次猜的数不同，那么最后的结果可能也会不同
     *      但是我们可以把第一次猜的数当成一个分割线，分成左右两边，比如第一次猜3，那么就有
     *      [1,2] 3 [4,5]  这样就分成了左右两边，那是要考虑[1,2]还是考虑[4,5]？
     *      肯定是考虑[4,5]啦，因为本题是考虑最少金额的情况，所以要悲观的考虑，也就是说每次都选择右边的那个数组
     *      接下来就是计算[4,5]的情况，两个数中猜，肯定先猜最小的那个4
     *      这样下来，如果第一次猜3的情况，那么最后最少金额为3+4=7(注意这不是最优解）
     *
     *      上面第一次猜测3只是其中一种情况，所以我们需要循环从1开始猜到5，所以所有的情况如下：
     *      第一次猜：1   结果：1 + [2,3,4,5] = 7
     *      第一次猜：2   结果：2 + Max([1], [3,4,5]) = 4
     *      第一次猜：3   结果：3 + Max([1,2], [4,5]) = 7
     *      第一次猜：4   结果：4 + Max([1,2,3],[5]) = 6
     *      第一次猜：5   结果：5 + [1,2,3,4] = 9
     *      所以输入5最小的金额就是4
     *
     *      这道题得采用动态规划来解，理论上使用递归更加直观，但是在leetcode上运行超时了，因为需要递归左右
     *      两边，耗时更久，所以采用动态规划更快
     *      声明一个二维数组int[][] dp = new int[n+2][n+2];
     *      dp[i][j]就是在i~j中猜测的最小金额，比如dp[1][5]就是在范围[1,5]中猜测需要的最小金额
     *      求dp[i][j]的关键式子：
     *      dp[i][j] = Math.min(d[i][j], k+Math.max(dp[i][k-1], dp[k+1][j]));
     *      i,j 分别为起始值和终止值，k是猜测的一个数（作为左右两边的分割数）
     */

    public int getMoneyAmount(int n) {
        // 加2是为了从1开始，并且防止k+1越界
        int[][] dp = new int[n+2][n+2];
        for (int i = 0; i <= n ; i++) {
            // 让其等于0是因为，在范围[i,i]中猜测需要的最小金额为0
            // 比如，让你在范围[1,1]猜测，想都不用想肯定是1
            dp[i][i] = 0;
        }
        // len表示长度，没循环一轮就能算出每轮个数为len的值
        // 比如len为2时，一轮下来就能算出[1,2],[2,3],[3,4],[4,5]的值
        for (int len = 2; len <= n; len++) {
            // i为起始位置
            for (int i = 1; i <= n-len+1; i++) {
                // j为终止位置
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                // k为在这个区间猜测的值
                for (int k = i; k <= j ; k++) {
                    dp[i][j] = Math.min(dp[i][j], k+Math.max(dp[i][k-1], dp[k+1][j]));
                }
            }
        }

        return dp[1][n];
    }


    /**
     * 用递归的方式最明显，但是耗时久，在leetcode运行超时
     * @param l  起始值
     * @param r  终止值
     */
    public int find(int l, int r){
        if(l >= r){
            return 0;
        }

        int pay = Integer.MAX_VALUE;

        for (int k = l; k <= r ; k++) {
            int tmp = k+Math.max(find(l,k-1), find(k+1,r));
            pay = tmp < pay? tmp:pay;
        }

        return pay;
    }


    public static void main(String[] args) {
        GuessNumber2 guessNumber2 = new GuessNumber2();
        System.out.println(guessNumber2.getMoneyAmount(99));
    }
}
