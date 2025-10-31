class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        if len(pattern) != len(s.split()):
            return False
        m = dict()
        for p , st in zip(pattern,s.split()):
            if p in m:
                if m[p] != st:
                    return False
            elif st in m.values():
                return False
            m[p] = st
        return True