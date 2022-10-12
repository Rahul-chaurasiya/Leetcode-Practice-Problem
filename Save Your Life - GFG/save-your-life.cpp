//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution{
public:
      string maxSum(string w,char x[], int b[],int n){

          // code here     

            unordered_map<char,int> m;

            for(int i = 0; i<n; i++){

                m[x[i]] = b[i];

            }

            string ans;

            string temp;

            int curr = 0;

            int maxi = INT_MIN;

            for(char c:w){

                if(m.find(c)!= m.end()){

                    curr+= m[c];

                }

                else{

                    curr += c;

                }

                temp += c;

                if(curr > maxi){

                    maxi = curr;

                    ans = temp;

                }

                if(curr <0){

                    curr = 0;

                    temp = "";

                }

            }

            return ans;
      }
};


//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        string w;
        cin>>w;
        int n;
        cin>>n;
        char x[n];
        int b[n];
        for(int i = 0;i<n;i++)
            cin>>x[i];
        for(int i = 0;i<n;i++)
            cin>>b[i];
        Solution ob;
        cout << ob.maxSum(w,x,b,n) << endl;
    }
    return 0; 
}
// } Driver Code Ends