package ValidParentheses.tenYearsIn;

import java.util.Stack;

/**
 * Created With Intellij IDEA
 *
 * @auth MaChao
 * @time 2019-06-25 22:39
 * @Description Valid Parentheses
 */
public class Solution {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if(")".equals(String.valueOf(c))){
                if( stack.empty() || !"(".equals(String.valueOf(stack.pop())) ){
                    return false;
                }
            }else if("}".equals(String.valueOf(c))){
                if( stack.empty() || !"{".equals(String.valueOf(stack.pop())) ){
                    return false;
                }
            }else if( "]".equals(String.valueOf(c))){
                if( stack.empty() || !"[".equals(String.valueOf(stack.pop())) ){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        if( stack.empty() ){
            return true;
        }
        return false;
    }

}
