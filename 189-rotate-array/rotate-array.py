class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        k = k % len(nums)
        i = 0
        j = len(nums)-k-1
        while(i<j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i+=1
            j-=1
        
        i = len(nums)-k
        j = len(nums)-1
        while(i<j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i+=1
            j-=1
        
        i=0
        j=len(nums)-1
        while(i<j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i+=1
            j-=1