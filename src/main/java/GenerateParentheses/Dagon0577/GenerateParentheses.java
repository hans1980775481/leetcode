package GenerateParentheses.Dagon0577;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dagon0577
 * @date 2019/6/12 17:30
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        fullyArranged(result, "", n, 0);
        return result;
    }

    private void fullyArranged(List<String> result, String s, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }
        if (left > 0) {
            fullyArranged(result, s + "(", left - 1, right + 1);
        }
        if (right > 0) {
            fullyArranged(result, s + ")", left, right - 1);
        }
    }

}
