//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      boolean ans = obj.isBSTTraversal(a);
      System.out.println(ans?"True":"False");
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static boolean isBSTTraversal(int nums[]) {
        int n=nums.length;
        for(int i=0; i<n-1;i++){
           if(nums[i+1]<=nums[i]){
               return false;
           } 
        }
        return true;

  }
}
     