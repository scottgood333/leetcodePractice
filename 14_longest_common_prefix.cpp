#include <string>

class Solution
{
public:
    string longestCommonPrefix(vector<string> &strs)
    {
        string longest_prefix = "";
        int i, j;
        for (j = 0; j < strs[0].size(); j++)
        {
            for (i = 0; i < strs.size(); i++)
            {
                if (strs[i].size() <= j)
                    return longest_prefix; // end of string
                if (strs[i][j] != strs[0][j])
                    return longest_prefix; // no match
            }
            longest_prefix += strs[0][j];
        }
        return longest_prefix;
    }
};