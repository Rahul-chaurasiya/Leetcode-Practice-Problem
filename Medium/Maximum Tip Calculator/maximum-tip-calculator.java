//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int x;
            x = Integer.parseInt(br.readLine());

            int y;
            y = Integer.parseInt(br.readLine());

            int[] arr = IntArray.input(br, n);

            int[] brr = IntArray.input(br, n);

            Solution obj = new Solution();
            long res = obj.maxTip(n, x, y, arr, brr);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    static class Pair{
        int a;
        int b;
        int diff;
        Pair(int a , int b , int diff){
            this.a = a;
            this.b = b;
            this.diff = diff;
        }
    }
    
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)-> b.diff - a.diff);
        
        for(int i =0;i<n;i++){
            pq.add(new Pair(arr[i] , brr[i] , Math.abs(arr[i]-brr[i])));
        }
        
        long sum = 0;
        int countA =0;
        int countB = 0;
        while(!pq.isEmpty() ){
            Pair p = pq.poll();
            int a = p.a;
            int b = p.b;
            
            if((a>=b && countA<x) || countB>=y){
                sum+=a;
                countA++;
            }
            else{
                sum+=b;
                countB++;
            }
        }
        return sum;
    }
}