//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        int x = n;
        // int rem = 0;
        int count = 0;
        while(x > 0){
            int rem = x%10;
            x = x/10;
            if(rem == 0) continue;
            if(n%rem == 0) count++;
        }
        return count;
    }
}