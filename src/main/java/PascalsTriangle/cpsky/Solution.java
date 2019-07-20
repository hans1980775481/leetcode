package PascalsTriangle.cpsky;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: sky
 * @Date: 2019/7/20
 * @Description:
 */
public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> r = generate(3);
        System.out.println(r.get(2));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res= new ArrayList<>();
        List temp = new ArrayList();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i;j ++) {
                if (j == 0 || j ==i) {
                    temp.add(1);
                } else  if (i -  1 >= 0 && j - 1 >= 0){
                    temp.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(temp);
            temp = new ArrayList();
        }
        return res;
    }
}