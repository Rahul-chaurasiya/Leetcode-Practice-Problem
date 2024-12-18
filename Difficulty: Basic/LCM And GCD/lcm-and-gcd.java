//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int g = gcd(a,b);
        int l = (a * b) / gcd(a, b);
        return new int[] {l,g};
    }
    
    public static int gcd(int a, int b){
        while(a != b){
            if(a>b) a = a-b;
            else b = b-a;
        }
        return a;
    }
    
    public static int lcm(int a, int b){
        return a/b;
    }
}

//{ Driver Code Starts.

// } Driver Code Ends