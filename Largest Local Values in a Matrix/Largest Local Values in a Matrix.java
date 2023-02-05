class Solution {
    public int[][] largestLocal(int[][] grid) {
		int ans[][] = new int[grid.length - 2][grid.length - 2];
		for (int i = 0; i < grid.length - 2; i++) {
			for (int j = 0; j < grid.length - 2; j++) {
				ans[i][j] = findMax(grid, i, j);
			}
		}
        return ans;
	}

	public int findMax(int[][] grid, int i, int j) {
		int Max = Integer.MIN_VALUE;
		for (int a = i; a <= i + 2; a++) {
			for (int b = j; b <= j + 2; b++) {
				Max = Math.max(grid[a][b], Max);
			}
		}
		return Max;
	}
}
