from typing import List

class Solution:
    """
    Approach: Hash Set
    Intuition: Iterate through the array and check if an element is already in the set.
    Time Complexity: O(n)
    """
    def containsDuplicate(self, nums: List[int]) -> bool:
        # Create a hash set to store seen elements
        seen = set()

        for n in nums:
            if n in seen:
                return True
            else:
                seen.add(n)
        
        return False