class Solution
{
public:
    bool is_match(char l_brac, char r_brac)
    {
        if (l_brac == '(' && r_brac == ')')
            return true;
        if (l_brac == '[' && r_brac == ']')
            return true;
        if (l_brac == '{' && r_brac == '}')
            return true;
        return false;
    }

    bool isValid(string s)
    {
        stack<char> l_bracs;
        // split string s
        for (char c : s)
        {
            if (c == '(' || c == '{' || c == '[')
                l_bracs.push(c);
            else if (l_bracs.empty() || !is_match(l_bracs.top(), c))
                return false;
            else
                l_bracs.pop();
        }
        if (l_bracs.empty())
            return true;
        return false;
    }
};