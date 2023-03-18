class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int cur_unique = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != cur_unique) {
                cur_unique = nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}