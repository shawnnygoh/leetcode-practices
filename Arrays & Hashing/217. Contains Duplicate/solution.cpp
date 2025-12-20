#include <vector>
#include <unordered_set>

class Solution {
public:
    /*
     * Approach: Hash Set
     * Intuition: Iterate through the array and check if an element is already in the set.
     * Time Complexity: O(n)
     */
    bool containsDuplicate(std::vector<int>& nums) {
        // Create a hash set to store seen elements
        std::unordered_set<int> seen;

        // Pre-allocate memory to avoid rehashes
        seen.reserve(nums.size());

        for (int num : nums) {
            if (seen.find(num) != seen.end()) {
                return true;
            }

            seen.insert(num);
        }

        return false;
    }
};