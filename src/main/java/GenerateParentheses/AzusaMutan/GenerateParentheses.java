package GenerateParentheses.AzusaMutan;
import java.util.ArrayList;
import java.util.List;

class GenerateParentheses {
        public List<String> generateParenthesis(int n) {
            List<String> ans = new ArrayList<String>();
            StringBuilder sb = new StringBuilder("(");
            return f(ans,sb,n,1,0);
        }

        public List<String> f (List<String> ans,StringBuilder sb, int n, int leftN, int rightN) {
            if (leftN == n && rightN == n) {
                ans.add(sb.toString());
            }
            if (leftN <= n && rightN != n) {
                sb.append("(");
                f(ans,sb,n,leftN+1,rightN);
                sb.deleteCharAt(sb.length()-1);
                if (leftN > rightN) {
                    sb.append(")");
                    f(ans,sb,n,leftN,rightN+1);
                    sb.deleteCharAt(sb.length()-1);
                }
            }

            return ans;
        }
    }
