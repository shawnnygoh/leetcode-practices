class Solution {
    /*
    Approach 2: Sorting
    Intuition: Sorts the array in ascending order first, then checks if adjacent elements are the same. If any duplicates are found, returns 'true'.
    Time Complexity: O(nlogn)
    */

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }


    /*
    Approach 1: Brute Force
    Intuition: Compares each element with every other element in the array to check for duplicates. If any duplicates are found, returns 'true'.
    Time Complexity: O(n^2) - Time Limit Exceeded
    */

    /* public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false; 
    } */
}