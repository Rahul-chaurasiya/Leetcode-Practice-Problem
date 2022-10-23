//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int  N = Integer.parseInt(input_line[0]);
            int  M = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            int ans = ob.steppingNumbers(N, M);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends


//User function Template for Java


class Solution{
    int steppingNumbers(int n, int m){
        Queue<Integer> q = new ArrayDeque<>();
        int cnt = 0;
        for(int i = 1;i<10;i++){
            q.offer(i);
        }
        if(n==0) cnt++;
        while(!q.isEmpty()){
            int node = q.poll();
            if(node>=n && node<=m){
                cnt++;
            }
            int child,lastdigit = node%10;
            node*=10;
            if(lastdigit!=0){
                child = node+lastdigit-1;
                if(child<=m) q.offer(child);
            }
            if(lastdigit!=9){
                child = node+lastdigit+1;
                if(child<=m) q.offer(child);
            }
        }
        return cnt;
    }

};
