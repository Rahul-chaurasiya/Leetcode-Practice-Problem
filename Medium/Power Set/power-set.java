//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        List<String>l = new ArrayList<>();
        find(l,s,"",0);
        Collections.sort(l);
        l.remove("");
        return l;
    }
    
    private void find(List<String>l,String s,String ans,int i){
        if(s.length() == i){
            l.add(ans);
            return;
        }
        char ch = s.charAt(i);
        find(l,s,ans+ch,i+1);
        find(l,s,ans,i+1);
    }
}