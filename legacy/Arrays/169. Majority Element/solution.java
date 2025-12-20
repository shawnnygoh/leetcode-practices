class Solution {
    /* 
        Approach 1: HashMap
        Intuition: Keep track of the number of times each element appears in the 'nums'
        array using a HashMap. If a key (element in 'nums') has a value (count) that exceeds 
        n / 2, where n is the size of 'nums', return that key (the majority element).
        
        Initialize a HashMap 'count' to keep track of the count of each element in 'nums'.
        Traverse through every element in the 'nums' array with a 'for' loop, inserting the 
        element into the HashMap if it does not exist as a key. Otherwise, if it does exist,
        fetch its value (count) and increment it by one. If the value is greater than n / 2,
        return the key.
        
        Time Complexity: O(n) - only one traversal of the array is required, so the time complexity is linear.
        Space Complexity: O(n) - a HashMap requires linear space.
    */ 

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int numsLength = nums.length;

        for (int i = 0; i < numsLength; i++) {
            int curr = nums[i];

            if (count.containsKey(curr)) {
                count.put(curr, count.get(curr) + 1);
            } else {
                count.put(curr, 1);
            }

            if (count.get(curr) > numsLength / 2) { 
                return curr;
            }
        }

        return 0;
    }
}