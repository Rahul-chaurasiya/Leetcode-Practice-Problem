//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++
class Solution {
public:
    vector<bool> sieve(int mx) {
        vector<bool> isprime(mx+1,true);
        isprime[0] = false;
        isprime[1] = false;
        for(int i=2;i<mx;++i) {
            if(isprime[i])
                for(int j=2*i;j<mx;j += i) {
                    isprime[j] = false;
                }
        }
        return isprime;
    }
    string isSumOfTwo(int N){
        vector<bool> isprime = sieve(N);
        int a = 2 , b = N-2;
        while(a <= b) {
            if(isprime[a]&&isprime[b])
                return "Yes";
            a++;
            b--;
        }
        return "No";
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;
        Solution ob;
        cout << ob.isSumOfTwo(N) << endl;
    }
    return 0;
}

// } Driver Code Ends