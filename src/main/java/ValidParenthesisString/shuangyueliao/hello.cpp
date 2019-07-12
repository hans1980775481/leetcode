#include <iostream>
#include <math.h>
#include <limits.h>
#include <vector>
#include <string.h>
using namespace std;
class Solution
{
public:
    bool checkValidString(string s)
    {
        vector<char> t;
        int low = 0;
        int high = 0;
        for (char c : s)
        {
            if (c == '(')
            {
                low++;
                high++;
            }
            else if (c == '*')
            {
                if (low > 0)
                    low--;
                high++;
            }
            else
            {
                if (low > 0)
                    low--;
                high--;
            }
            if (high < 0)
                return false;
        }
        return low == 0;
    }
};
int main()
{
    Solution s;
    system("pause");
    return 0;
}