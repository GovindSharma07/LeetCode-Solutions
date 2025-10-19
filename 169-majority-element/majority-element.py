class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maj = nums[0]
        appear = 0
        for num in nums:
            if num == maj:
                appear +=1
            else:
                if(appear == 0):
                    maj = num
                    appear = 1
                else:
                    appear -=1
        return maj