//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long ExtractNumber(String sentence) {
        String[] arr=sentence.split("\\s+");
        long largeNum=-1;
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i].charAt(0)) && !arr[i].contains("9")){
                long currNum=Long.parseLong(arr[i]);
                if(largeNum<currNum){
                    largeNum=currNum;
                }
            }
        }
        return largeNum;
    }
}