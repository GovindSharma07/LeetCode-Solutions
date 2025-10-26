from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs):
        groups = defaultdict(list)
        
        for s in strs:
            # Create a fixed-size list for a-z counts (O(1) initialization)
            counts = [0] * 26
            
            # Populate the counts (O(L) time)
            for char in s:
                # Assuming lowercase English letters constraint
                index = ord(char) - ord('a')
                counts[index] += 1
            
            # Use the count tuple as the dictionary key (O(1) creation)
            key = tuple(counts)
            groups[key].append(s)
            
        return list(groups.values())