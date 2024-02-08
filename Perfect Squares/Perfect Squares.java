class Solution {
    public int numSquares(int n) {
        int numberLimit = (int) Math.sqrt(n);
        int[][] dp = new int[numberLimit + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int result = recurse(numberLimit, n, dp);
        return result;
    }

    int recurse(int num, int remaining, int[][] dp) {
        if (remaining == 0) return 0;
        if (num == 1) return remaining;
        if (dp[num][remaining] != -1) return dp[num][remaining];
    
        int lowest = recurse(num - 1, remaining, dp);
        if (remaining - num * num >= 0) 
            lowest = Math.min(lowest, 1 + recurse(num, remaining - num * num, dp));
        
        dp[num][remaining] = lowest;
        return lowest;
    }
}
