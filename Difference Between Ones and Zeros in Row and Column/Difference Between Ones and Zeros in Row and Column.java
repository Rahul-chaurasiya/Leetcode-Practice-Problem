class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row[] = new int[grid.length];
        int col[] = new int[grid[0].length];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                row[i] += grid[i][j];
                col[j] += grid[i][j];
            }
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                grid[i][j] = row[i]+col[j] - (grid.length-row[i])-(grid[0].length-col[j]);
            }
        }
        return grid;
    }
}
