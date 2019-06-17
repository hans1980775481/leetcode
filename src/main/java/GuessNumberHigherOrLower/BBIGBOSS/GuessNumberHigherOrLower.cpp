//
// Created by BBIGBOSS on 2019-06-17.
//

// Forward declaration of guess API.
// @param num, your guess
// @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
int guess(int num);

class Solution
{
    public:

    int guessNumber(int n)
    {
        long left = 0, right = n;

        while (left < right)
        {
            long mid = (left + right) / 2;

            if (guess(mid) == 1)
                left = mid + 1;
            else if (guess(mid) == -1)
                right = mid;
            else
                return mid;
        }

        return left;
    }
};