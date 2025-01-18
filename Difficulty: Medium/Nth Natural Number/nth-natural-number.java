//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while (t-- > 0) {
            long n = ob.nextLong();
            Solution ab = new Solution();
            long k = ab.findNth(n);
            System.out.println(k);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    long findNth(long n) {
        // code here
        long count = 0;
        long p = 1;
        while(n>=1){
            long rem = n%9;
            count += p*rem;
            p = p*10;
            n = n/9;
        }
        return count;
    }
}