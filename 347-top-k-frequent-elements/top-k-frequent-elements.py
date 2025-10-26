class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        count = Counter(nums)
        res = [[] for _ in range(len(nums)+1)]
        out = []
        for value, freq in count.items():
            res[freq].append(value)
        for i in res[::-1]:
            for j in i:
                if k!=0:
                    out.append(j)
                    k -=1
                else:
                    return out
        return out
        