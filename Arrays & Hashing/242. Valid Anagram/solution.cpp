#include <string>
#include <unordered_map>

class Solution {
public:
    /*
     * Approach: Hash Map
     * Intuition: Count frequency of all chars in one string and see if it matches up with the other.
     * Time Complexity: O(n + m)
     */
    bool isAnagram(std::string s, std::string t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        std::unordered_map<char, int> chars;
        
        for (char c : s) {
            chars[c]++;
        }
        
        for (char c : t) {
            chars[c]--;
            if (chars[c] < 0) {
                return false;
            }
        }

        return true;
    }
};