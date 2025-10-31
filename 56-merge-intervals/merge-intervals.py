class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals.sort(key = lambda x:x[0])
        start = intervals[0][0]
        end = intervals[0][1]
        res = []
        for i in intervals[1:]:
            if i[0] <= end:
                end = max(i[1],end)
            
            else:
                res.append([start,end])
                start = i[0]
                end = i[1]
        res.append([start,end])
        return res