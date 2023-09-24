//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int arr2[] = new int[n];
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++) arr2[arr[i]]++;
        for(int i=0;i<n;i++) if(arr2[i] > 1) l.add(i);
        if(l.size()>0)return l;
        else {
            l.add(-1);
            return l;
        }
    }
}
