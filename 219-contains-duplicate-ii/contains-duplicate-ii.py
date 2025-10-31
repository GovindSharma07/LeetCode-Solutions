class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        seen = dict()
        for index , value in enumerate(nums):
            if value in seen:
                if abs(index-seen[value])<=k:
                    return True
            seen[value] = index
        return False