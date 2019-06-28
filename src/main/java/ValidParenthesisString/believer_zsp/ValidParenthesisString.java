package sxu.java.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidParenthesisString {

    //"**((*"
    public boolean checkValidString(String s) {
        int len = s.length();
        //将(*放入栈1中,栈2临时存放
        Stack<Character> stack1 = new Stack();
        Stack<Character> stack2 = new Stack();
        //判断跳出循环时stack1的状态
        boolean flag = true;
        Character temp = null;
        for (int index = 0; index < len; index++) {
            if (s.charAt(index) == '(' || s.charAt(index) == '*') {
                stack1.push(s.charAt(index));
            } else {
                flag = true;
                //如果stack1中没有数据则说明是
                if (!stack1.empty()) {
                    temp = stack1.peek();
                    while (!stack1.empty()) {
                        if (stack1.pop() == '*') {
                            stack2.push(temp);
                        } else {
                            flag = false;
                            break;
                        }
                    }
                    //因为没有stack中没有数跳出循环
                    if (flag) {
                        stack2.pop();
                    }
                    while (!stack2.empty()) {
                        stack1.push(stack2.pop());
                    }
                } else {
                    return false;
                }
            }
        }
        while (!stack1.empty()) {
            temp = stack1.pop();
            if (temp == '*') {
                stack2.push(temp);
            } else if (temp == '(' && !stack2.empty()) {
                stack2.pop();
            } else {
                return false;
            }
        }
        return true;
    }
}
