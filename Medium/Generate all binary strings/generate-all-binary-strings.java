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
      Solution obj = new Solution();
      List<String> ans = obj.generateBinaryStrings(n);
      for(String s : ans) System.out.print(s+" ");
      System.out.println();
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  public static List<String> generateBinaryStrings(int n) {
    List<String>l = new ArrayList<>();
    char ch[] = new char[n];
    ch[0] = '0';
    generate(ch,1,n,l);
    ch[0] = '1';
    generate(ch,1,n,l);
    return l;
  }
  
  private static void generate(char []ch, int idx, int n, List<String>l){
      if(idx == n){
          l.add(new String(ch));
        //   System.out.println(new String(ch));
          return;
      }
      if(ch[idx-1] == '0'){
          ch[idx] = '0';
          generate(ch, idx+1, n, l);
          ch[idx] = '1';
          generate(ch, idx+1, n, l);
      }
      if(ch[idx-1] == '1'){
          ch[idx] = '0';
          generate(ch, idx+1, n, l);
      }
  }
}
     
     