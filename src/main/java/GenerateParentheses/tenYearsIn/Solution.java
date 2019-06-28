package GenerateParentheses.tenYearsIn;

import java.util.LinkedList;
import java.util.List;

/**
 * Created With Intellij IDEA
 * @auth MaChao
 * @time 2019-06-25 10:18
 * @Description Generate Parentheses
 */
public class Solution {

    public List<String> generateParenthesis(int n) {
        List list = new LinkedList<String>();
        recursion(list,"",0,0,3);
        return list;
    }


    public void recursion(List list, String cur, int left,int right,int max){

        if( cur.length() == max * 2 ){
            list.add(cur);
            cur = "";
            return ;
        }

        if( left < max ){
            recursion(list,cur + "(",left + 1 ,right,max);
        }

        if( left > right ){
            recursion(list,cur + ")",left,right + 1,max);
        }

    }

    public static void main(String[] args) {
        List<String> list = new Solution().generateParenthesis(3);
        System.out.println(list);
    }

}
