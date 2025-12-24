from typing import List

class Solution:
    """
    Approach: Hash Map (Sorting)
    Intuition: Sort the strings and use them as a key in a hash map to group the strings.
    Time Complexity: O(N * K log K)
    """
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = {}
        
        for string in strs:
            sorted_string = "".join(sorted(string))

            if sorted_string in anagrams:
                anagrams[sorted_string].append(string)
            else:
                anagrams[sorted_string] = [string]
        
        return list(anagrams.values())
    
    
    """
    Approach: Hash Map (Character Frequency)
    Intuition: Map a 26-slot frequency tuple to a list of strings.
    Time Complexity: O(N * K)
    """
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = {}

        for string in strs:
            count = [0] * 26

            for char in string:
                count[ord(char) - ord('a')] += 1
            
            frequency_tuple = tuple(count)

            if frequency_tuple in anagrams:
                anagrams[frequency_tuple].append(string)
            else:
                anagrams[frequency_tuple] = [string]
        
        return list(anagrams.values())