//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.getCount(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public long getCount(int n) {
        // Your code goes here
        if (n == 1) {
            return 10;
        }
        
        int arr[][] = {
            {0, 8}, 
            {1, 2, 4}, 
            {1, 2, 3, 5}, 
            {2, 3, 6}, 
            {1, 4, 5, 7}, 
            {2, 4, 5, 6, 8}, 
            {3, 5, 6, 9}, 
            {4, 7, 8}, 
            {0, 5, 7, 8, 9}, 
            {6, 8, 9} 
        };
        
        long dp[][] = new long[n + 1][10];
        
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }
        
        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < 10; j++) {
                dp[i][j] = 0;
                for (int x: arr[j]) {
                    dp[i][j] += dp[i - 1][x];
                }
            }
        }
        
        long ans = 0;
        for (int i = 0; i < 10; i++) {
            ans += dp[n][i];
        }
        
        return ans;
    }
}