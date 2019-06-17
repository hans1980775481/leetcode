//
// Created by BBIGBOSS on 2019-06-17.
//

// Core: DP[i][j] = min(mid + max(DP[i][mid - 1], DP[mid + 1][j]))

class Solution
{
    public:

    int getMoneyAmount(int n)
    {
        vector<vector<long>> DP(n + 1, vector<long> (n + 1, 0));

        for (int i = 2; i <= n; i++)
            for (int j = i - 1; j >= 1; j--)
            {
                if (j >= i - 2)
                    DP[j][i] = i - 1;
                else
                {
                    long localMin = LONG_MAX;

                    for(int k = j + 2; k < i; k++)
                        localMin = min(localMin, k + max(DP[j][k - 1], DP[k + 1][i]));

                    DP[j][i] = localMin;
                }
            }

        return DP[1][n];
    }
};