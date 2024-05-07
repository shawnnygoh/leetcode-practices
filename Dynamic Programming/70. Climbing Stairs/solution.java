class Solution {
    /*
        Approach 2: Memoization
        Intuition: Basically the same as the previous approach with the fibonacci 
        algorithm but with the introduction of memoization with the help of a Hash Map 
        which removes the need for unnecessary calculations, reducing time complexity.

        Use a HashMap 'memo' to store the calculations at each step 'n'. Before making 
        the recursive call, check if the result for the given 'n' already exists in 
        'memo'. If it does, return the stored value. Else, compute the result and store
        it in the memo for future reference. 

        Time Complexity: O(n)
        Space Complexity: O(n)
    */

    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairsHelper(n, memo);
    }
    
    public int climbStairsHelper(int n, Map<Integer, Integer> memo) {

        if (n == 0 || n == 1) {
            return 1;
        }

        if (!memo.containsKey(n)) {
            memo.put(n, climbStairsHelper(n - 1, memo) + climbStairsHelper(n - 2, memo));
        }

        return memo.get(n);
    }

    /* 
        Approach 1: Fibonacci Sequence
        Intuition: When listing out the distinct ways one can climb to the top (which takes
                    n steps), the sequence for number of distinct ways to reach the nth step
                    forms a pattern - namely the sum the of the number of distinct ways to 
                    reach the top for 'n - 1' and 'n - 2' steps (the fibonacci sequence).
    
        Time Complexity: O(2^n) - exponential time due to fibonacci algorithm 
        Space Complexity: O(n)
    */ 
    /* 
        public int climbStairs(int n) {

            if (n == 0 || n == 1) {
                return 1;
            } else {
                return climbStairs(n - 1) + climbStairs(n - 2);
            }

        }
    */
}