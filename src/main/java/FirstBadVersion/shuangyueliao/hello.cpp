#include <iostream>
#include <math.h>
using namespace std;
// Forward declaration of isBadVersion API.
bool isBadVersion(int version)
{
    if (version > 3)
        return true;
    else
    {
        return false;
    }
    
}
class Solution {
public:
    public:
    int firstBadVersion(int n) {
        int begin = 1;
        int end = n;
        int m;
        while (begin <= end)
        {
            m = begin + (end - begin) / 2;
            if (isBadVersion(m))
            {
                end = m - 1;
            }
            else
            {
                begin = m + 1;
            }

        }
        return begin - 1;
        
    }
};
int main()
{
    Solution s;
    cout << s.firstBadVersion(4);
    system("pause");
    return 0;
}