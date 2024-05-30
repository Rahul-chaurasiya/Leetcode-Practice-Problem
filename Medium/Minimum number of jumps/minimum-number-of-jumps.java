//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
         int maxR=0, max = 0, jump = 0, n=arr.length;
        
        if(n<=1) return 0;
        
        for(int i=0; i<n; i++){
            
            max = Math.max(max,i+arr[i]);
            
            if(maxR == i){
                maxR = max;
                jump++;
            }
            
            if(maxR>=n-1)
            return jump;
            
        }
        // if(maxR<n-1)
            return -1;
    }

 
    }
