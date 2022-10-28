//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution {
	public:
		int NthTerm(int n){

     // Code  here

     long mod = 1000000007;

     vector<long> dp(n+1,-1);

     

     long ans = 1;

     dp[0]=1;

     for(int i=1; i<=n; i++){

         dp[i] = (dp[i-1]*ans + 1)%mod;

         ans++;

     }

     

     return (int)dp[n];

 }

};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n;
		cin >> n;
		Solution obj;
		int ans = obj.NthTerm(n);
		cout << ans << "\n";
	}
	return 0;
}
// } Driver Code Ends