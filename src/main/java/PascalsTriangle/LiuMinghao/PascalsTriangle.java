package PascalsTriangle.LiuMinghao;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resolt = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            if(i==0){
                list.add(1);
                resolt.add(list);
            }else {
                for(int j=0;j<i+1;j++){
                    if(j==0||j==i){
                        list.add(1);
                    }else{
                        list.add(temp.get(j)+temp.get(j-1));
                    }
                }
                resolt.add(list);
            }
            temp=list;
        }
        return resolt;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
