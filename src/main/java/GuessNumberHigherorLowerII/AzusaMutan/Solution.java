package GuessNumberHigherorLowerII.AzusaMutan;

class Solution {
    public int getMoneyAmount(int n) {
        int[][] memory = new int[n+1][n+1];
        return dfs(memory, 1, n);
    }

    public int dfs (int[][] memory, int begin, int end) {
        if (begin >= end) return 0;
        if (memory[begin][end] != 0) return memory[begin][end];
        int res = Integer.MAX_VALUE;
        for (int i = begin; i <= end; i++) {
            res = Math.min(res, i+Math.max(dfs(memory, begin, i-1),dfs(memory, i+1, end)));
        }
        memory[begin][end] = res;
        return res;
    }
}
