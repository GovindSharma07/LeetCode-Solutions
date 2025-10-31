class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) == 0:
            return True
        i = 0
        for ch in t:
            if ch == s[i]:
                i += 1
            if len(s) == i:
                return True
        return False   
        