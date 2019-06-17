package ValidParentheses.LonlyBonze;

import java.util.Stack;

/**
 * Created by codedrinker on 2019/6/17.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.add(c);
            } else {
                if (stack.size() > 0) {
                    switch (c) {
                        case ')':
                            if (stack.pop() != '(')
                                return false;
                            break;
                        case ']':
                            if (stack.pop() != '[')
                                return false;
                            break;
                        case '}':
                            if (stack.pop() != '{')
                                return false;
                            break;
                    }
                } else {
                    return false;
                }
            }
        }
        if (stack.size() != 0)
            return false;
        return true;
    }
}
