class Solution {
    public int countNegatives(int[][] grid) {
        
        int count = 0; 
        int rows = grid.length;
        int cols = grid[0].length;

        int currentCol = cols - 1;

        for (int row = 0; row < rows; row++) {
            while (currentCol >= 0 && grid[row][currentCol] < 0) {
                count += rows - row; 
                currentCol--;
            }
        }

        return count;
    }
}



========================================================================================
  
  
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            for (int element : row) {
                if (element < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
