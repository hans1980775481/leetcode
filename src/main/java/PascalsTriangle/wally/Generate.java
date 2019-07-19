package PascalsTriangle.wally;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public List<List<Integer>> generate(int numRows){
        if (numRows == 0){
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.get(0).add(1);
        for (int i = 1; i < numRows; i++){
            List<Integer> prev = list.get(i - 1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = i; j < i; j++){
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
        }
        return list;
    }
}
