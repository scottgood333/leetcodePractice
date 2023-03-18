class Solution
{
public:
    bool isPalindrome(long int x)
    {
        if (x < 0)
            return false;

        long int temp;
        long int reversed_x = 0;
        temp = x;
        while (temp != 0)
        {
            reversed_x = reversed_x * 10 + temp % 10;
            temp = temp / 10;
        }
        return reversed_x == x;
    }
};