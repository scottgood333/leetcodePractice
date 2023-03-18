#include <queue>

class Solution
{
public:
    queue<int> make_queue(string s)
    {
        queue<int> Q;
        for (char c : s)
        {
            switch (c)
            {
            case 'I':
                Q.push(1);
                break;

            case 'V':
                Q.push(5);
                break;

            case 'X':
                Q.push(10);
                break;

            case 'L':
                Q.push(50);
                break;

            case 'C':
                Q.push(100);
                break;

            case 'D':
                Q.push(500);
                break;

            case 'M':
                Q.push(1000);
                break;

            default:
                Q.push(0);
                break;
            }
        }
        return Q;
    }

    int romanToInt(string s)
    {
        int sum = 0;
        int num1, num2;
        queue<int> Q = make_queue(s);
        while (!Q.empty())
        {
            num1 = Q.front(); // current number's value
            Q.pop();

            num2 = 0;
            if (!Q.empty())
                num2 = Q.front(); // look ahead next number's value

            // special case
            if (num2 > num1)
            {
                Q.pop();
                sum = sum + num2 - num1;
            }
            else
                sum = sum + num1;
        }

        return sum;
    }
};