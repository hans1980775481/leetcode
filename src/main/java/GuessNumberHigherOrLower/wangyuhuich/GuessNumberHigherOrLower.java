package GuessNumberHigherOrLower.wangyuhuich;

/**
 * 我们正在玩一个猜数字游戏。 游戏规则如下：
 * 我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
 * 每次你猜错了，我会告诉你这个数字是大了还是小了。
 * 你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
 * <p>
 * -1 : 我的数字比较小
 * 1 : 我的数字比较大
 * 0 : 恭喜！你猜对了！
 * 示例 :
 * <p>
 * 输入: n = 10, pick = 6
 * 输出: 6
 * <p>
 * 执行用时 :1 ms, 在所有 Java 提交中击败了99.19%的用户
 * 内存消耗 :33.7 MB, 在所有 Java 提交中击败了67.19%的用户
 */

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        return guessProcess(1, n);
    }

    public int guessProcess(int starts, int ends) {

        if (starts > ends) {
            return 0;
        }
        if (starts == ends) {
            return starts;
        }

        long start = starts;
        long end = ends;

        int middle = (int) ((start + end) / 2);
        switch (guess(middle)) {
            case -1:
                return guessProcess(starts, middle);
            case 0:
                return middle;
            case 1:
                return guessProcess(middle + 1, ends);
        }
        return 0;
    }

    private int guess(int n) {
        return 1;
    }
}
