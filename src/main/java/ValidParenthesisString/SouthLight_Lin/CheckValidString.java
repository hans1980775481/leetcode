package ValidParenthesisString.SouthLight_Lin;

import java.util.Stack;

/**
 * 验证括号2
 *      "("必须要跟")"相互匹配，"*"可以充当任何符号
 * 比如：
 *      Input: "()"
 *      Output: True
 *
 *      Input: "(*)"
 *      Output: True
 *
 *      Input: "(*))"
 *      Output: True
 *
 * @author SouthLight-Lin on 2019/6/27
 */
public class CheckValidString {

    /**
     * 解法：使用一个栈作为辅助结构
     *      分为两步：
     *      1、先遍历一遍字符串，将'('和'*'加入栈中，每遇到一个')'
     *      就按条件删除一个'('或者'*'，条件就是如果栈中有'('就将'('删除，如果栈顶不为'('但是栈中（遍历）有'('
     *      就将'('移动到栈顶并将'('删除，如果栈中没有'('，就用'*'抵消
     *      2、当字符串遍历完后，如果栈不为空，就遍历栈，每个'*'都要抵消一个'('，直到遇到'(('或者'*('的情况，就返回false
     */
    public boolean checkValidString(String s) {
        if (s.equals("") || s.equals("*")){
            return true;
        }

        char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            // 如果遇到'('或者'*'，就入栈
            if (chars[i] == '(' || chars[i] == '*'){
                stack.push(chars[i]);
            }
            // 如果遇到')'
            else {
                // 如果栈为空，直接返回false
                if (stack.isEmpty()){
                    return false;
                }
                // 如果栈顶刚好是'('
                if (stack.peek()=='('){
                    stack.pop();
                    continue;
                }
                // 如果栈顶是'*'
                else {
                    // 统计总共有多少个连续的'*'
                    int mi=0;
                    for (int idx = stack.size()-1; idx > 0; idx--) {
                        if (stack.get(idx) == '*')  mi++;
                        else break;
                    }
                    // 如果后面全是'*'直接返回true，因为没必要考虑了，直接将'*'当成'('和''
                    if (mi == stack.size()){
                        return true;
                    }
                    // 将前面的'('移动到'最后一个'*'的位置
                    stack.set(stack.size()-1, '(');
                    stack.set(stack.size()-1-mi, '*');
                    // 弹出这个'('与')'匹配
                    stack.pop();
                    continue;
                }
            }

        }

        // 剩下的一个'*'一定要去掉一个'('
        // 如果栈还不为空
        while (!stack.isEmpty()){
            char c = stack.pop();
            if (c=='(' && stack.isEmpty() || c=='('&&stack.peek()=='*' || c=='('&&stack.peek()=='('){
                return false;
            }
            else if (c=='*' && stack.isEmpty()){
                return true;
            }
            else if (c=='*' && stack.peek()=='('){
                stack.pop();
            }
            // 连续'**'两个的情况
            // 一定要消除一个'('
            // 统计总共有多少个连续的'*'
            else {
                int mi=0;
                for (int idx = stack.size()-1; idx > 0; idx--) {
                    if (stack.get(idx) == '*')  mi++;
                    else break;
                }
                // 如果后面全是'*'直接返回true，因为没必要考虑了，直接将'*'当成'('和''
                if (mi == stack.size()){
                    return true;
                }
                // 将前面的'('移动到'最后一个'*'的位置
                stack.set(stack.size()-1, '(');
                stack.set(stack.size()-1-mi, '*');
                stack.pop();
                continue;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckValidString validString = new CheckValidString();
        System.out.println(validString.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*"));


    }
}
