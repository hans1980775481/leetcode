//
// Created by BBIGBOSS on 2019-06-15.
//

class Solution
{
    public:

    void moveZeroes(vector<int>& nums)
    {
        for (int i = 0, j = 0; j < nums.size(); j++)
            if (nums[j] != 0)
                swap(nums[j], nums[i++]);
    }
};