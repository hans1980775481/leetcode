//
// Created by BBIGBOSS on 2019-06-15.
//

class Solution
{
    public:

    vector<string> result;

    vector<string> generateParenthesis(int n)
    {
        core(0, 0, n, "");
        return result;
    }

    void core(int left, int right, int n, string s)
    {
        if (right == n)
        {
            result.emplace_back(s);
            return;
        }

        if (left < n)
            core(left + 1, right, n, s + "(");

        if (right < left)
            core(left, right + 1, n, s + ")");
    }
};