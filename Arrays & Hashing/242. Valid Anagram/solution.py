class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        """
        Approach: Hash Map
        Intuition: Count frequency of all chars in one string and see if it matches up with the other.
        Time Complexity: O(n + m)
        """
        if len(s) != len(t):
            return False

        chars = {}

        for c in s:
            chars[c] = 1 + chars.get(c, 0)
        
        for c in t:
            chars[c] = chars.get(c, 0) - 1
            if chars[c] < 0:
                return False
        
        return True
