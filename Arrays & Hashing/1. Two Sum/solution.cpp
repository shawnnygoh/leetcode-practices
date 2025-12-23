#include <vector>
#include <unordered_map>

class Solution {
public:
    /*
     * Approach: Hash Map
     * Intuition: Calculate the complement for each number and check if it has already been seen.
     * Time Complexity: O(n)
     */
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        std::unordered_map<int, int> seen;

        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums[i];

            if (seen.find(complement) != seen.end()) {
                return {seen[complement], i};
            }

            seen[nums[i]] = i;
        }

        return {};
    }
};