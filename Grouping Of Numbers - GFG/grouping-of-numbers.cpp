//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
        int maxGroupSize(int arr[], int N, int k) {

        // code here

        map<int, int>ma;

        for(int i=0; i<N; i++){

            ma[arr[i]%k]++;

        }

        int low=1;

        int high=k-1;

        int ans = 0;

        while(low<=high){

            if(low==high and ma[low]>0){

                ans++;

                break;

            }

            ans+=max(ma[low],ma[high]);

            low++;

            high--;

        }

        if(ma[0]>0){

            ans++;

        }

        return ans;

    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N,K;
        
        cin>>N>>K;
        int arr[N];
        
        for(int i=0; i<N; i++)
            cin>>arr[i];

        Solution ob;
        cout << ob.maxGroupSize(arr,N,K) << endl;
    }
    return 0;
}
// } Driver Code Ends