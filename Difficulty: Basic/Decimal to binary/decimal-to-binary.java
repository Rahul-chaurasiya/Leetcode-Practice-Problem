//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int N = sc.nextInt();
			Solution obj = new Solution();
			obj.toBinary(N);
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	void toBinary(int num) {
		if (num == 0) {
        System.out.print("0");
    }
    
    StringBuilder binary = new StringBuilder();
    while (num > 0) {
        binary.append(num % 2); // Append remainder of num / 2 (0 or 1)
        num /= 2; // Divide num by 2
    }
    System.out.print(binary.reverse().toString());
    
	}
}