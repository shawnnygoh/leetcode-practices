class Solution {
    /*
    Approach 1: Two Pointers
    Intuition: Two pointers 'i' and 'newLength' to remove the elements equal to 'val' 
                from the 'nums' array while maintaining the relative order of the 
                remaining elements. 'i' will traverse through the array to identify 
                elements equal to 'val'. 'newLength' will keep track of the length of 
                the new array after the elements equal to 'val' have been removed.
    Time Complexity: O(n)
    Space Complexity: O(1)
    */

    public int removeElement(int[] nums, int val) {
        int newLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newLength] = nums[i];
                newLength++;
            }
        }
        
        return newLength;
    }
}