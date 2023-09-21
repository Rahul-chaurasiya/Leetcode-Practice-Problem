//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        arr1[0] = arr[0];
        for(int i=1;i<n;i++){
            arr1[i] = Math.max(arr1[i-1],arr[i]);
        }
        
        arr2[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr2[i] = Math.max(arr2[i+1],arr[i]);
        }
        
        long res = 0;
        for(int i=1;i<n-1;i++){
            res += Math.min(arr1[i],arr2[i])-arr[i];
        }
        
        return res;
    } 
}


