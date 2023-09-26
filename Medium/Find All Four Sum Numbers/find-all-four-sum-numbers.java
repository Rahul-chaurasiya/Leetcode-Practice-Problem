//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

  class Solution
  {
      //Function to find all quadruplets in the array that sum up to given value.
      public ArrayList <ArrayList<Integer>> fourSum(int[] arr, int k)
      {
          // Your code here
          ArrayList<ArrayList<Integer>> result = new ArrayList<>();
          Arrays.sort(arr);

          for (int i = 0; i < arr.length - 3; i++) {
              if (i == 0 || (i > 0 && arr[i] != arr[i-1])) {
                  for (int j = i+1; j < arr.length - 2; j++) {
                      if (j == i+1 || (j > i+1 && arr[j] != arr[j-1])) {
                          int left = j + 1;
                          int right = arr.length - 1;
                          while (left < right) {
                              int sum = arr[i] + arr[j] + arr[left] + arr[right];
                              if (sum == k) {
                                  result.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[left], arr[right])));
                                  left++;
                                  right--;
                                  while (left < right && arr[left] == arr[left-1]) left++;
                                  while (left < right && arr[right] == arr[right+1]) right--;
                              } else if (sum < k) {
                                  left++;
                              } else {
                                  right--;
                              }
                          }
                      }
                  }
              }
          }
          return result;
      }
  }