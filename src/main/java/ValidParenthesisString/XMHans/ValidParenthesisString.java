package ValidParenthesisString.XMHans;

import java.util.HashMap;
import java.util.LinkedList;

public class ValidParenthesisString {

    public boolean checkValidString(String s) {
        StringBuffer ans = new StringBuffer(s);
        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < ans.length() ; i++) {
            if (ans.charAt(i) == ')') {
                int top = stack.size()-1;
                while (top >= 0 && stack.get(top) == '*') {
                    top--;
                }
                if (top == -1) {
                    if (stack.size() == 0) {
                        return false;
                    } else {
                        stack.removeLast();
                    }
                } else {
                    stack.remove(top);
                }
            } else {
                stack.addLast(ans.charAt(i));
            }
        }
        int sum = 0;
        for (int i = ans.length() - 1; i >= 0; i--) {
            if (ans.charAt(i) == '(') {
                if (sum > 0) {
                    sum -= 1;
                } else {
                    return false;
                }
            } else {
                sum++;
            }
        }

        return true;
    }

    public void main(String[] args) {
        if (checkValidString("*(*))")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
