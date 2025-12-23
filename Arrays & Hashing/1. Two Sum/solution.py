from typing import List

class Solution:
    """
    Approach: Hash Map
    Intuition: Calculate the complement for each number and check if it has already been seen.
    Time Complexity: O(n)
    """
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}

        for i, n in enumerate(nums):
            complement = target - n
            if complement in seen:
                return [seen[complement], i]
            seen[n] = i