class Solution {

    /*
    Approach 1: XOR
    Intuition: Using XOR on all the elements of the array gives us the number that appears once. 
                1. XOR of a number with itself is 0. 
                2. XOR of a number with 0 is number itself.
                Example: 7 ^ (2 ^ 2) = 7 ^ 0 = 7
    Time Complexity: O(n)
    Space Complexity: O(1)
    */

    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else {
            int result = nums[0];
            for (int i = 1; i < nums.length; i++) {
                result = result ^ nums[i];
            }

            return result;
        }
    }
}