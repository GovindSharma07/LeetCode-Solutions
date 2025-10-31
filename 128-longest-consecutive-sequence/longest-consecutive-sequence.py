class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        longest = 0
        s = set(nums)
        for i in s:
            if i-1 not in s:
                temp = 1
                while i+1 in s:
                    temp+=1
                    i +=1
                longest = max(longest,temp)
        return longest
        