package PascalsTriangle.XMHans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        int[][] result = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            result[i] = new int[i+1];
        }
        for (int i = 0; i < numRows; i++) {
            result[i][0] = result[i][i] = 1;
        }
        for (int i = 2; i < numRows; i++) {
            for (int j = 1; j < i; j++) {
                result[i][j] = result[i-1][j-1] + result[i-1][j];
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ans.add(Arrays.stream(result[i])
                        .boxed()
                        .collect(Collectors.toList()));
        }
        return ans;

    }
}
