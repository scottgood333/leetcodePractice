class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        for i, a in enumerate(nums):
            temp = target - a
            for j, b in enumerate(nums[i+1:]):
                if b == temp:
                    return i, i+j+1
