package ValidParentheses.wally;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author wally
 */
public class ValidParentheses {
    public boolean validParentheses(String s) {
        if (s.length() % 2 != 0){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                stack.push(ch);
            }else if (stack.isEmpty() || ch != map.get(stack.pop())){
                return false;
            }
        }
       return stack.isEmpty();
    }
}
