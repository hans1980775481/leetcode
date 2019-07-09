package ValidParentheses.XMHans;

import java.util.HashMap;

public class ValidParentheses {

    public boolean isValid(String s) {
        StringBuffer ans = new StringBuffer(s);
        HashMap<Character,Character> map = new HashMap<>();
        map.put(']','[');
        map.put(')','(');
        map.put('}','{');
        boolean result = true;
        for (int i = 0; i < ans.length() ; i++) {
            if (isLeftOrRight(ans.charAt(i)) == 0) {
                if (i > 0 && map.get(ans.charAt(i)) == ans.charAt(i-1)) {
                    ans.deleteCharAt(i-1);
                    ans.deleteCharAt(i);
                    i = i-2;
                } else {
                    result = false;
                    break;
                }
            }
        }
        if (ans.length() > 0) result = false;
        return result;
    }
    public int isLeftOrRight(char ch) {
        int ans = 0;
        if (ch == '{' || ch == '[' || ch == '(') ans = 1;
        return ans;
    }
}
