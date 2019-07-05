package GenerateParentheses.yanxianni;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author WangChenYao
 * @Date 2019/7/1 11:35
 * @Version 1.0
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "(", 1, 0, n);
        return result;
    }

    // 若某个位置填了右括号，则之前必须有一个与它对应的左括号
    private void generate(List<String> list, String s, int left, int right, int max) {
        if (left == max && right == max) {
            list.add(s);
            return;
        }
        // 若该位置可以填左括号，则尝试选填左括号
        if (left < max) {
            generate(list, s + "(", left + 1, right, max);
        }
        // 若已经填的位置中，左括号大于右括号，则该位置可以填右括号
        if (left > right) {
            generate(list, s + ")", left, right + 1, max);
        }
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.generateParenthesis(3));
    }
}
