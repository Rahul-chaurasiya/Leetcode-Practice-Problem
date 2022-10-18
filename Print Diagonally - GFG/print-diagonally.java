//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int n, int a[][])
    {
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            list.add(a[0][i]);
            int j=0,k=i;
            while(j++<n && k-->0){
                list.add(a[j][k]);
            }
        }
        
        for(int i=1;i<n;i++){
            list.add(a[i][n-1]);
            int j=i,k=n-1,temp=i;
            while(j++<n && k-->temp){
                list.add(a[j][k]);
            }
        }
        return list;
    }
}
