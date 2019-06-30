package ValidParentheses.SouthLight_Lin;

import java.util.Stack;

/**
 * 验证括号
 * 题目：
 *
 *    给定一个只包含字符'（'，'）'，'{'，'}'，'['和']'的字符串，确定输入字符串是否有效。
 *    如果输入字符串有效：
 *    必须使用相同类型的括号关闭左括号。
 *    必须以正确的顺序关闭打开括号。
 *    请注意，空字符串也被视为有效。
 *  例如：
 *      Input: "()"
 *      Output: true
 *
 *      Input: "()[]{}"
 *      Output: true
 *
 *      Input: "([)]"
 *      Output: false
 * @author SouthLight-Lin on 2019/6/27
 */
public class ValidParentheses {
    /**
     * 思路，用一个栈解决
     * 将所有的( [ '{' 入栈
     * 遇到右边的括号，就要从栈中弹出一个符号，判断是否与之对应
     * 如果不对应直接返回false
     * 循环结束时，判断栈是否为空，如果为空返回true，不为空返回false
     * 不为空的情况是输入"(("这种类似的字符
     * 时间复杂度:O(n)
     */
    public boolean isValid(String s) {

        if (s.equals("") ){
            return true;
        }

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            // 将所有左边括号进行压栈
            if (chars[i]=='(' || chars[i] == '[' || chars[i] == '{'){
                stack.push(chars[i]);
                continue;
            }

            if (stack.isEmpty())
                return false;

            // 每遇到一个右括号就得从栈中弹出一个左括号
            else if (chars[i] == ')'){
                if (stack.pop() != '(')
                    return false;
                continue;
            }
            // 每遇到一个右']'就得从栈中弹出一个'['
            else if (chars[i] == ']'){
                if (stack.pop() != '[')
                    return false;
                continue;
            }
            // 每遇到一个'}'就得从栈中弹出一个'{'
            if (stack.pop()!='{')
                return false;
        }

        return stack.isEmpty()?true:false;
    }

    public static void main(String[] args) {
        ValidParentheses validBrackets = new ValidParentheses();
        String input = "((";
        System.out.println(validBrackets.isValid(input));
    }
}
