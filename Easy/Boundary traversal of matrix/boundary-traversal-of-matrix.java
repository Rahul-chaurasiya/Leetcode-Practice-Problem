//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            s = in.readLine().trim().split(" ");
            int ind=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[ind++]);
                }
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.boundaryTraversal(a, n, m);
            for (int i : ans) {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
        ArrayList<Integer> list = new ArrayList<>();


        if (n == 1) {
            for (int i = 0; i < m; i++) {
                list.add(matrix[0][i]);

            }
            return list;
        }

        if (m == 1) {
            for (int i = 0; i < n; i++) {
                list.add(matrix[i][0]);
            }
            return list;
        }

        if (n == 1 && m == 1) {
            list.add(matrix[0][0]);
            return list;
        }
        

        int i = 0;
        int j = 0;
        while (j < m) {
            list.add(matrix[i][j]);
            j++;
        }

        i++;
        int k = m - 1;
        while (i < n) {
            list.add(matrix[i][k]);
            i++;
        }


        i--;
        int col = m - 2;
        while (col >= 0) {
            list.add(matrix[i][col]);

            col--;
        }


        col++;
        int rc = n - 2;
        while (rc >= 1) {
            list.add(matrix[rc][col]);

            rc--;
        }
        return list;
    }
}
