class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        values = [i for i in s]
        l = 0
        r = len(values) -1
        while l < r:
            while values[l].lower() not in ["a","e","i","o","u"] and l < r:
                l+=1
            while values[r].lower() not in ["a","e","i","o","u"] and l < r:
                r-=1
            if l<r:
                values[l],values[r] = values[r],values[l]
                l+=1
                r-=1
        return "".join(values)
                
        