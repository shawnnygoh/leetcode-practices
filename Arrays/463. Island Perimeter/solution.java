class Solution {
    public int islandPerimeter(int[][] grid) {
        /*             
            Approach 1: Iteration
            Intuition: Count the number of edges that are touching 
            water by iterating over each cell and checking if it is a
            land cell and if its adjacent cells are land cells as well. 

            Initialize a counter to track the island perimeter. Iterate 
            through each grid cell of the map. If the cell is equal to 1 
            (or land), add 4 to the island perimeter. Check if the 
            adjacent cells on the right and on the bottom are also equal 
            to 1 (or land). If so, subtract 2 from the island perimeter 
            counter (since it would be double-counted otherwise).

            Time Complexity: O(m * n)
            Space Complexity: O(1)
        */

        int landPerimeter = 0;
        int rows = grid.length;
        int columns = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == 1) {
                    landPerimeter += 4;

                    if (i < rows - 1 && grid[i + 1][j] == 1) {
                        landPerimeter -= 2;
                    } 
                    
                    if (j < columns - 1 && grid[i][j + 1] == 1) {
                        landPerimeter -= 2;
                    }
                } 
            }
        }

        return landPerimeter;
    }
}