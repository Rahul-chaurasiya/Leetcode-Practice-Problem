class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        int ans = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1') ans++;
                func(grid,i,j);
            }
        }
        return ans;
    }

    private void func(char[][] grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] != '1') return;
        grid[i][j] = '0'; 
        func(grid, i + 1, j); 
        func(grid, i - 1, j); 
        func(grid, i, j + 1); 
        func(grid, i, j - 1); 
    }
}
