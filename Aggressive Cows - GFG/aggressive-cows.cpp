//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
public:

    bool isPos(int n, int k, vector<int> &stalls, int mid){
        int placed = 1;
        
        int first = 0, last = 0;
        
        while(last<n){
            while(last < n && (stalls[last]-stalls[first])<mid){
                last++;
            }
            if(last==n){
                break;
            }
            else{
                placed++;
                first = last;
            }
        }
        
        return placed>=k;
    }
    
    int solve(int n, int k, vector<int> &stalls) {
        sort(stalls.begin(),stalls.end());
        int low = 1, high = 1e9;
        
        int ans;
        
        while(low<=high){
            int mid = low + (high-low)/2;

            if(isPos(n,k,stalls,mid)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        
        return ans;
    }
};

//{ Driver Code Starts.

int main() {
    int t = 1;
    cin >> t;

    // freopen ("output_gfg.txt", "w", stdout);

    while (t--) {
        // Input

        int n, k;
        cin >> n >> k;

        vector<int> stalls(n);
        for (int i = 0; i < n; i++) {
            cin >> stalls[i];
        }
        // char ch;
        // cin >> ch;

        Solution obj;
        cout << obj.solve(n, k, stalls) << endl;

        // cout << "~\n";
    }
    // fclose(stdout);

    return 0;
}
// } Driver Code Ends