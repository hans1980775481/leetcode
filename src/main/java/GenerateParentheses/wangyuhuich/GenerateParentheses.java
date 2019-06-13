package GenerateParentheses.wangyuhuich;

import java.util.ArrayList;
import java.util.List;

/**
 * 解答区 回溯法
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "(", 1, 0, n);
        return result;
    }

    public void backtrack(List<String> list, String preString, int leftCount, int rightCount, int max) {
        if (leftCount == max && rightCount == max) {
            list.add(preString);
            return;
        }
        if (leftCount < max) {
            backtrack(list, preString + "(", leftCount + 1, rightCount, max);
        }
        if (leftCount > rightCount) {
            backtrack(list, preString + ")", leftCount, rightCount + 1, max);
        }
    }
}
