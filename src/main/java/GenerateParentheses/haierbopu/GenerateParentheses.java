import java.util.ArrayList;
import java.util.List;
class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> a = new ArrayList();
        String s = new String();
        return func(s, n, n, a);
    }

    //create a helper function to perform the recursion
    public List<String> func(String p, int l, int r, List<String> result){
        //case 1: if we can still add '(', then we add it
        if (l > 0){
            func(p+'(', l-1, r, result);
        }
        //case 2: if r>l, which means we have more ')' than '(' in p, so we can add ')' and parenthesis is still valid
        if (r > l){
            func(p+')', l, r-1, result);
        }
        //case 3: when r is 0, which means l should also be 0, we have nothing to add, we put the p into the result
        if (r == 0){
            result.add(p);
        }

        return result;
    }

    public static void main(String []args) {
        System.out.println("GenerateParentheses");
    }
}
