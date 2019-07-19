package PascalsTriangle.maliyuan;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> gengerate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> temp =new ArrayList<Integer>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> route = new ArrayList<Integer>();
            if (i == 0){
                route.add(1);
                list.add(route);
            } else {
                route.add(1);
                for (int j=1;j< i+1;j++){
                    if(j==i ){
                        route.add(1);
                    }else{
                        route.add(temp.get(j)+temp.get(j-1));
                    }
                }
                list.add(route);
            }
            temp = route;
        }
        return list;
    }
}
