from collections import Counter
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        group = defaultdict(list)
        for i in strs:
            key = tuple(sorted(Counter(i).items()))
            group[key].append(i)
        return [i for i in group.values()]