//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
//User function template for C++
class Solution{
public:
	vector<int> findSubarray(int a[], int n) {
	    // code here
	    int sum = 0;

     vector<int>ans={-1};

     int l=0,r=0;

     while(l<n && r<n)

     {

         if(a[l]<0)

         {

             l++;

             continue;

         }

         else if(a[l]>=0)

         {

             r=l;

             int currSum=0;vector<int>temp;

             while(r<n && a[r]>=0)

             {

                 currSum+=a[r];

                 temp.push_back(a[r]);

                 r++;

             }

             if(currSum>sum)

             {

                 sum = currSum;

                 ans.clear();

                 ans = temp;

             }

             l = r;

         }

     }

          return ans;
	}
};

//{ Driver Code Starts.

void printAns(vector<int> &ans) {
    for (auto &x : ans) {
        cout << x << " ";
    }
    cout << "\n";
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, i;
        cin >> n;
        int a[n];
        for (i = 0; i < n; i++) {
            cin >> a[i];
        }
        Solution ob;
        auto ans = ob.findSubarray(a, n);
        printAns(ans);
    }
    return 0;
}

// } Driver Code Ends