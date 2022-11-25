//{ Driver Code Starts
//Initial Template for C++

#include <iostream>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{

   long long v[64][64];

public:

 

  

long long ncr(int n,int r){

     if(n<r) return 0;

     if(r==0||r==n) return 1;

     if(v[n][r]!=-1){ 

         return v[n][r];

     }

        v[n][r]= ncr(n-1,r)+ ncr(n-1,r-1);

        return v[n][r];

     

 }

    

    long long count(long long x) {

   

        long long ans=0;

        for(int i=0;i<64;i++){

            for(int j=0;j<64;j++){

                v[i][j]=-1;

            }

        }

        int pos=0;

        int one=0;

        while(x>0){

        if(x&1){

            one++;

        ans+=ncr(pos,one);

        }

        pos++;

        x>>=1;

        }

        

     return ans;   

        

    }};

//{ Driver Code Starts.

int main() {
    
	int t;
	cin >> t;
	while (t-- > 0) {
	    long long x; cin >> x;
	    Solution ob;
	    cout << ob.count(x) << '\n';
	}
	return 0;
}
// } Driver Code Ends