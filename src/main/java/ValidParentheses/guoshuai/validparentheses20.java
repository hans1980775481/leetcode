package test;

import java.util.Stack;

/*
 * 2019/6/11
 * 实现思路：使用栈解决
 * 			看了别人的答案发现使用数组模拟栈更快
 * 
 * 
 */

public class validparentheses20 {
	public boolean isValid(String s) {
        if(s.length()==0){
            return true;
        }
        Stack<Character> stack = new Stack();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                char temp;
                if(!stack.isEmpty()){
                    temp = stack.pop();
                }
                else{
                    return false;
                }
                if(temp=='('&&s.charAt(i)==')'||temp=='{'&&s.charAt(i)=='}'||
                   temp=='['&&s.charAt(i)==']'){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }


}