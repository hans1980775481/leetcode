package GenerateParentheses.SouthLight_Lin;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成括号，输入数字n
 * 返回生成的括号的所有情况
 * 比如：
 *      输入：1
 *      返回：["()"]
 *      输入：2
 *      返回：["(())", "()()"]
 * @author SouthLight-Lin on 2019/6/29
 */
public class GenerateParenthesis {
    /**解不出来，只能看答案理解**/

    /**
     * 最简单的解法：暴力破解
     *      每个位置上不是"("就是")"，通过不断的尝试不同位置上不同符号的组合来求解
     *      比如输入2，总共就有16种，因为4个字符，就有2*2*2*2情况，然后判断每种情况是否符合括号的标准
     *      是就添加，不是就放弃
     *      时间复杂度O(n^2n)
     */

    /**
     * 解法一：回溯
     *      1、因为每个位置上不是"("就是")"，我们可以先将位置上先设为"("，等到"("
     *      的个数到达n个，就开始添加")"，直到总长度到达n*2，将该字符添加进结果集
     *      2、回溯到添加的最后一个"("，将该位置添加成")"
     *      3、重复1步骤
     */
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n==0){
            res.add("");
            return res;
        }
        backtracking(res,"", 0, 0, n);
        return res;
    }

    /**
     * 回溯
     * @param res  存放结果的结果集
     * @param cur   当前字符串
     * @param left  左括号个数
     * @param right 右括号个数
     * @param n     括号对数
     */
    private void backtracking(List<String> res, String cur, int left, int right, int n) {
        // 如果括号个数达到了n
        if (cur.length() == n*2){
            res.add(cur);
            return;
        }
        // 添加左括号
        if (left<n)
            backtracking(res, cur+"(", left+1, right,n);
        // 上面添加了左括号后，尝试将这个位置换成右括号试试
        // 注意，右括号的个数只能小于等于左括号的个数
        if (right<left)
            backtracking(res, cur+")", left, right+1, n);
    }


    /**
     * 解法二：左右子括号
     *      比如输入3,那么它的子括号有(1)left,(1)right
     *      然后通过"("+(left)+")" + (right)
     */
    public List<String> generateParenthesis2(int n){
        List<String> res = new ArrayList<>();
        if (n == 0){
            res.add("");
            return res;
        }
        for (int i = 0; i < n; ++i) {
            for (String left:generateParenthesis2(i))
                for (String right:generateParenthesis2(n-1-i))
                    res.add("("+left+")"+right);
        }
        return res;
    }



    public static void main(String[] args) {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        List<String> res = generateParenthesis.generateParenthesis2(4);
        System.out.println(res.size());
        for (String s : res) {
            System.out.println(s);
        }
    }
}


