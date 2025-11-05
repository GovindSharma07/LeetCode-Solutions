class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        ans = []
        i = 0
        while i < len(word1) and i< len(word2):
            ans.append(word1[i])
            ans.append(word2[i])
            i += 1
        if i < len(word1):
            ans.append(word1[i:])
        else:
            ans.append(word2[i:])
        return "".join(ans)
