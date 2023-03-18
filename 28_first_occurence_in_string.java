class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            try {
                if (needle.equals(haystack.substring(i, i + needle.length())))
                    return i;
            } catch (StringIndexOutOfBoundsException e) {
                return -1;
            }
        }
        return -1;
    }
}