package ValidParentheses.weiyien;

import java.util.Stack;

/**
 * @auther: 魏薏恩
 * @date: 2019/6/26 18:07
 * @description:
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        Character temp, last;
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[') {
                stack.push(temp);
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    last = stack.pop();
                    if (temp == ')' && last != '(') {
                        return false;
                    } else if (temp == '}' && last != '{') {
                        return false;
                    } else if (temp == ']' && last != '[') {
                        return false;
                    }
                }
            }
        }
        if (stack.empty() && stack.empty() && stack.empty()) {
            return true;
        }
        return false;
    }

}
