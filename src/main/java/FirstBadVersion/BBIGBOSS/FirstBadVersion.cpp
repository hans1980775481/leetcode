//
// Created by BBIGBOSS on 2019-06-17.
//

// Forward declaration of isBadVersion API.
bool isBadVersion(int version);

class Solution
{
    public:

    int firstBadVersion(int n)
    {
        long left = 1, right = n;

        while (left < right)
        {
            long mid = (left + right) / 2;

            if (!isBadVersion(mid))
                left = mid + 1;
            else
                right = mid;
        }

        return left;
    }
};