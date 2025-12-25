from typing import List
from collections import Counter
import heapq

class Solution:
    """
    Approach: Hash Map + Min Heap
    Intuition: Count frequencies and maintain a heap of size K to find the most frequent elements.
    Time Complexity: O(N log K)
    """
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = Counter(nums)

        top_k = heapq.nlargest(k, count.keys(), key=count.get)
        
        return top_k
    

    """
    Approach: Bucket Sort
    Intuition: Use an array where index represents frequency of elements.
    Time Complexity: O(N)
    """
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}

        freq = [[] for _ in range(len(nums) + 1)]

        for n in nums:
            count[n] = 1 + count.get(n, 0)
        
        for n, c in count.items():
            freq[c].append(n)
        
        result = []

        for i in range(len(freq) - 1, 0, -1):
            for n in freq[i]:
                result.append(n)
                if len(result) == k:
                    return result