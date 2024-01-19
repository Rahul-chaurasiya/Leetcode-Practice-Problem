class Solution {

    
    public int minsum(int[][] matrix,int i,int j, int[][] dp){
        
         if(i>=matrix.length)
          return 0;
        
         if(j<0 || j>=matrix[0].length )
         return Integer.MAX_VALUE;

        if(dp[i][j]!=Integer.MAX_VALUE)
          return dp[i][j];

        int sum1=minsum(matrix,i+1,j-1,dp);
        int sum2=minsum(matrix,i+1,j,dp);
        int sum3=minsum(matrix,i+1,j+1,dp);

        int sum=Math.min(sum1,sum2);
        sum=Math.min(sum,sum3);

        dp[i][j]=matrix[i][j]+sum;
        return dp[i][j];

    }
    public int minFallingPathSum(int[][] matrix) {

        
        int[][] dp=new int[matrix.length][matrix[0].length];
        for(int[] row:dp)
           Arrays.fill(row,Integer.MAX_VALUE);
          
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<matrix[0].length;j++){
            ans=Math.min(ans,minsum(matrix,0,j,dp));
        }

        return ans;
    }
}
