class Solution {
    public int lengthOfLastWord(String s) {
        int tail = 0;
        int head = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                tail = i;
                break;
            }
        }
        for (int i = tail; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                head = i + 1;
                break;
            }
        }
        return tail - head + 1;
    }
}