package ValidParentheses.lion;

import java.util.Stack;

public class ValidParentheses {
	 public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();
	        for(int i = 0; i < s.length(); i++) {
	            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
	                stack.push(s.charAt(i));
	            } else {
	                char pop = ' ';
	                try {
	                    pop = stack.pop();
	                } catch(Exception e) {
	                    return false;
	                }
	                if(pop == '(' && s.charAt(i) != ')') {
	                    return false;
	                } else if(pop == '{' && s.charAt(i) != '}') {
	                    return false;
	                } else if(pop == '[' && s.charAt(i) != ']') {
	                    return false;
	                }
	                
	            }
	            
	        }
	        if(!stack.empty()){
	            return false;
	        }
	        return true;
	    }
}
