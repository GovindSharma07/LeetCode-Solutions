from collections import Counter
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        group = defaultdict(list)
        for i in strs:
            c = Counter(i)
            a = [0]*26
            for value,freq in c.items():
                a[ord(value) - ord("a")] = freq
            group[tuple(a)].append(i)
        return [i for i in group.values()]