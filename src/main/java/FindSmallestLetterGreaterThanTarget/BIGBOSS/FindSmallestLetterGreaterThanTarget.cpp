//
// Created by BIGBOSS on 2019-06-27.
//

class Solution
{
    public:

    char nextGreatestLetter(vector<char>& letters, char target)
    {
        if (target >= letters[letters.size() - 1])
            return letters[0];

        int left = 0, right = letters.size();

        while (left < right)
        {
            int mid = (left + right) / 2;

            if (letters[mid] > target)
                right = mid;
            else
                left = mid + 1;
        }

        return letters[left];
    }
};