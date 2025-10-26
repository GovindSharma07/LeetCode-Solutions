class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False

        seen = [0]*26
        for i,j in zip(s,t):
            seen[ord(i) - ord("a")] += 1
            seen[ord(j) - ord("a")] -= 1
        
        for i in seen:
            if i != 0:
                return False
        return True
        
            
        