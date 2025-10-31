class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        rcount = Counter(ransomNote)
        mcount = Counter(magazine)

        for val,freq in rcount.items():
            if freq> mcount.get(val,0):
                return False
        return True
        