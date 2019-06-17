package ValidParentheses.weichong0325;

import java.util.Stack;

/**
 * Create by weichong0325 on 2019/6/13
 * leetcode-20:有效的括号
 * 解题思路：
 * 入栈第一个元素要进行开括号的校验，后续添加元素，开括号入栈，
 * 有相应的闭括号，则进行退栈,否则入栈
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] str = s.toCharArray();
        for (char i:str){
            if (i=='('||i=='{'||i=='['){
                stack.push(i);
            }
            else {
                if (stack.isEmpty() == true){
                    return false;
                }
               if (i==')'&& stack.pop()=='('||i=='}'&& stack.pop()=='{'||i==']'&&stack.pop()=='['){
                    continue;
               }
               else {
                    return false;
               }
            }
        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }

}
