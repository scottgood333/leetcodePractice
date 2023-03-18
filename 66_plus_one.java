class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;

        try {
            digits[i]++;
            while (digits[i] == 10) {
                digits[i] -= 10;
                digits[--i] += 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int j = 1; j < result.length; j++) {
                result[j] = digits[j - 1];
            }
            return result;
        }
        return digits;
    }
}