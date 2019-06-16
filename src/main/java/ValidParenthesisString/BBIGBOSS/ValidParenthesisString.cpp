//
// Created by BBIGBOSS on 2019-06-15.
//

class Solution
{
    public:

    bool checkValidString(string s)
    {
        return core(s, 0, stack<char>());
    }

    bool core(string &s, int pos, stack<char> ss)
    {
        for (int i = pos; i < s.size(); i++)
        {
            char c = s[i];

            switch (c)
            {
                case '(':
                    ss.push(c);
                    break;
                case ')':
                    if (!ss.empty() && ss.top() == '(')
                        ss.pop();
                    else
                        return false;
                    break;
                case '*':
                    if (core(s, i + 1, ss))
                        return true;

                    s[i] = '(';
                    if (core(s, i, ss))
                        return true;

                    s[i] = ')';
                    if (core(s, i, ss))
                        return true;

                    return false;
            }
        }

        return ss.empty();
    }
};