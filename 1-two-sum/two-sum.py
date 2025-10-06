class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        check = {}
        for i in range(len(nums)):
            if check.get(target - nums[i]) == None:
                check[nums[i]] = i
            else:
                return [check[target-nums[i]],i]
        