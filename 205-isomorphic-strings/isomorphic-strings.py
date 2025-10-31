class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        m = dict()
        for sc,tc in zip(s,t):
            if sc in m:
                if m[sc] != tc:
                    return False
            elif tc in m.values():
                return False
            m[sc] = tc
        return True 