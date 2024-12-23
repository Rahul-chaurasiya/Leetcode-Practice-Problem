//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        int first = largest(arr);
        int prev = 0;
        for(int x:arr){
            if(x>prev && x != first) prev = x;
        }
        if(prev == 0) return -1;
        return prev;
    }
    
    public static int largest(int[] arr) {
        int prev = 0;
        for(int x:arr){
            if(x>prev) prev = x;
        }
        return prev;
    }
}