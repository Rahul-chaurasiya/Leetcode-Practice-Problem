//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
    int maximum_profit(int n, vector<vector<int>> &intervals) {
        // Write your code here.
         sort(intervals.begin(),intervals.end());

        vector<int> dp(n+1,0);

        for(int idx=n-1;idx>=0;idx--){

            vector<int> temp(3,0);

            temp[0]=intervals[idx][1];

            int next=lower_bound(intervals.begin(),intervals.end(),temp)-intervals.begin();

            int pick=intervals[idx][2]+dp[next];

            int notpick=dp[idx+1];

            dp[idx]=max(pick,notpick);            

        }

        return dp[0];
    }
};

//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<vector<int>> intervals(n, vector<int>(3));
        for (int i = 0; i < n; i++) {
            cin >> intervals[i][0] >> intervals[i][1] >> intervals[i][2];
        }
        Solution obj;
        cout << obj.maximum_profit(n, intervals) << endl;
    }
    return 0;
}

// } Driver Code Ends