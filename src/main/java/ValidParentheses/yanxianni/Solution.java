package ValidParentheses.yanxianni;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author WangChenYao
 * @Date 2019/7/1 11:58
 * @Version 1.0
 */
//示例 1:
//
//输入: "()"
//输出: true
//示例 2:
//
//输入: "()[]{}"
//输出: true
//示例 3:
//
//输入: "(]"
//输出: false
public class Solution {
    public boolean isValid(String s) {
        //如果字符串长度为奇数，直接false
        if (s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            // 如果有对应括号，则出栈
            if (!stack.isEmpty() && map.containsKey(stack.peek()) && map.get(stack.peek()) == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
