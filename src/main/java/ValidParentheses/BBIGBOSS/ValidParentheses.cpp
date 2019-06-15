//
// Created by BBIGBOSS on 2019-06-15.
//

class Solution
{
    public:

    bool isValid(string s)
    {
        stack<char> ss;

        for (char c : s)
        {
            switch (c)
            {
                case '(':
                case '[':
                case '{':
                    ss.push(c);
                    break;
                case ')':
                    if (!ss.empty() && ss.top() == '(')
                        ss.pop();
                    else
                        return false;
                    break;
                case ']':
                    if (!ss.empty() && ss.top() == '[')
                        ss.pop();
                    else
                        return false;
                    break;
                case '}':
                    if (!ss.empty() && ss.top() == '{')
                        ss.pop();
                    else
                        return false;
                    break;
                default:
                    ;
            }
        }

        return ss.empty();
    }
};