class Solution {
    int row;
    int col;
    public int getMaximumGold(int[][] grid) {
        int maxsum = 0;
        row = grid.length;
        col = grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] > 0){
                    int sum = dfs(grid,i,j);
                    maxsum = Math.max(maxsum,sum);
                }
            }
        }
        return maxsum;
    }

    public int dfs(int [][]grid, int i,int j){
        if(i<0 || i>=row || j<0 || j>=col || grid[i][j]==0) return 0;
        int temp = grid[i][j];
        grid[i][j] = 0;
        int upsum = dfs(grid,i-1,j);
        int downsum = dfs(grid,i+1,j);
        int leftsum = dfs(grid,i,j-1);
        int rightsum = dfs(grid,i,j+1);
        grid[i][j] = temp;
        return temp+Math.max(Math.max(Math.max(upsum,downsum),leftsum),rightsum);
    }
}
