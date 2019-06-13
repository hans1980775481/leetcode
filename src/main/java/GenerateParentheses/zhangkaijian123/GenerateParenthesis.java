package zhangkaijian123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-06-13 14:35
 **/
public class GenerateParenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String str = "";
        parenthesis(list,str,n,0);
        return list;
    }
    public static void parenthesis(List<String> list,String s,int left,int right){
        if (left==0&&right==0){
            list.add(s);
            return;
        }
        if (left>0){
            parenthesis(list,s+"(",left-1,right+1);
        }
        if(right>0){
            parenthesis(list,s+")",left,right-1);
        }
    }

    public static void main(String[] args) {
        List<String> list = generateParenthesis(3);
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
