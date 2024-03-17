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
      int a[][] = new int[n][2];
      for(int i=0;i<n;i++){
        a[i][0]=sc.nextInt();
        a[i][1]=sc.nextInt();
      }
      int h[]=new int[2];
      h[0]=sc.nextInt();
      h[1]=sc.nextInt();
      Solution obj = new Solution();
      int ans[][] = obj.insertNewEvent(n,a,h);
      System.out.print("[");
      for(int i=0;i<ans.length;i++)
       {
           System.out.print("[");
           System.out.print(ans[i][0]+","+ans[i][1]);
           System.out.print("]");
           if(i!=ans.length-1)
           System.out.print(",");
       }
      System.out.println("]");
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[][] insertNewEvent(int n,int[][] intervals, int[] newInterval) {
        List<int []>l = new ArrayList<>();
        int i;
        for(i=0;i<n;i++){
            if(intervals[i][1] < newInterval[0]) l.add(intervals[i]);
            else if(intervals[i][0] > newInterval[1]) break;
            else{
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        l.add(newInterval);
        while(i<n){
            l.add(intervals[i++]);
        }
        return l.toArray(new int[l.size()][2]);
    }
}
     