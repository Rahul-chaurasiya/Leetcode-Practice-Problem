class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[m][n];
    }
}


==========================================================================================
  
  
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        memo = new int[text1.length() + 1][text2.length() + 1];
        for (int[] i : memo) {
            Arrays.fill(i, -1);
        }
        return lcs(text1,text2,text1.length(),text2.length());
    }

    public int memo[][];

    public int lcs(String s1, String s2, int n, int m) {
        if (memo[n][m] != -1)
            return memo[n][m];
        else if (n == 0 || m == 0)
            return memo[n][m] = 0;
        else {
            if (s1.charAt(n - 1) == s2.charAt(m - 1))
                memo[n][m] = 1 + lcs(s1, s2, n - 1, m - 1);
            else
                memo[n][m] = Math.max(lcs(s1, s2, n - 1, m), lcs(s1, s2, n, m - 1));
        }
        return memo[n][m];
    }
}
