//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.padovanSequence(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
  public int padovanSequence(int n)
    {
        if(n<=2) return 1;
        int a = 1,b = 1,c = 1,temp = 0,mod = 1000000007;
        
        for(int i =3; i<=n; i++){
            temp = (a+b)%mod;
            
            a=b;
            b=c;
            c=temp;
        }
        return c;
    }
    
}
