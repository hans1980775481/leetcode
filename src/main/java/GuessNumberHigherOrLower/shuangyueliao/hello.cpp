#include <iostream>
#include <math.h>
using namespace std;
// Forward declaration of isBadVersion API.
int guess(int num)
{
    if (num == 6) {
        return 0;
    }
    else if (num > 6)
    {
        return -1;
    }
    else
    {
        return 1;
    }
    
}
class Solution {
public:
    public:
    int guessNumber(int n) {
        int begin = 1;
        int end = n;
        while (true)
        {
            int m = begin + (end - begin) / 2;
            if (guess(m) == 0)
            {
                return m;
            }
            else if (guess(m) == 1)
            {
                begin = m + 1;
            }
            else
            {
                end = m - 1;
            }
        }
        
    }
};
int main()
{
    Solution s;
    cout << s.guessNumber(10);
    system("pause");
    return 0;
}