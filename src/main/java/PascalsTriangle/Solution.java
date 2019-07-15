package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        if (numRows == 0) return ans;
        List<Integer> first = new ArrayList<>();
        first.add(1);
        ans.add(first);
        if (numRows == 1) return ans;
        List<Integer> sec = new ArrayList<>();
        sec.add(1);
        sec.add(1);
        ans.add(sec);
        if (numRows == 2) return ans;

        for (int i = 2; i < numRows; i++) {
            List<Integer> arr = new ArrayList<>();
            arr.add(1);
            for (int j = 1; j < i; j++) {
                arr.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            arr.add(1);
            ans.add(arr);
        }
        return ans;
    }
}