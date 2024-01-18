//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
     final int mod = 1000000007;
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        if(n == 1 || n == 2)return n;
        int prev1 = 1;
        int prev2 = 2;
        int next = 0;
        for(int i = 2; i < n; i++){
            next = (prev1 + prev2)%mod;
            prev1 = prev2;
            prev2 = next;
        }
        return next;
    }
}

