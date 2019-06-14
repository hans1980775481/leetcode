package ValidParenthesisString.Dagon0577;

/**
 * @author Dagon0577
 * @date 2019/6/12 18:35
 */
public class ValidParenthesisString {
    public boolean checkValidString(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (c == '(' || c == '*') {
                count++;
            } else {
                if (count == 0) {
                    return false;
                }
                count--;
            }
        }
        if (count == 0) {
            return true;
        }
        count = 0;
        for (int i = chars.length - 1; i >= 0; --i) {
            if (chars[i] == ')' || chars[i] == '*') {
                count++;
            } else {
                if (count == 0) {
                    return false;
                }
                count--;
            }
        }
        return true;
    }
}
