class Solution(object):
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n == 1:
            return True
        seen = set()
        while True:
            if n in seen:
                return False
            seen.add(n)
            temp = 0
            while n:
                temp += (n%10)**2
                n //= 10
            if temp == 1:
                return True
            n = temp
