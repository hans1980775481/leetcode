#include <iostream>
#include <math.h>
#include <limits.h>
#include <string.h>
using namespace std;
class Solution {
public:
    public:
    int getMoneyAmount(int n) {
        int **dp = new int *[n + 1];
        for (int i = 0; i < n + 1; i++)
        {
            dp[i] = new int[n + 1];
            memset(dp[i], 0, (n + 1) * sizeof(int));
        }
        return cost(dp, 1, n);
    }
    int cost(int **a,int start, int end)
    {   
        int b = INT_MAX;
        if (start >= end)
            return 0;
        if (a[start][end] != 0)
            return a[start][end];
        for (int i = start; i <= end; i++)
        {
            int tmp = i + max(cost(a, start, i - 1), cost(a, i + 1, end));
            if (tmp < b)
                b = tmp;
        }
        a[start][end] = b;
        return a[start][end];
    }

};
int main()
{
    Solution s;
    cout << s.getMoneyAmount(10);
    system("pause");
    return 0;
}