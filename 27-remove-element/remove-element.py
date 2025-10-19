class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        i = 0
        for value in nums:
            if(value != val):
                nums[i] = value
                i+=1
        return i

        