//{ Driver Code Starts
//Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++
class Solution{
    public:
     vector<long long int> twoOddNum(long long int Arr[], long long int N)  
    {
        long long int temp = 0;
        for(int i=0;i<N;i++) temp^=Arr[i];
        
        //checking right side se 1   // basically masking
        long long int check = 1;
        while(!(check & temp)) check<<=1;
        
        // 0 is identity for xor
        long long int a=0,b=0;
        for(int i=0;i<N;i++)
        {
            if(check&Arr[i]) a^=Arr[i];
            else b^=Arr[i];
        }
        vector<long long int> ans = {max(a,b),min(a,b)};
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
        long long int N;
        cin>>N;
        long long int Arr[N];
        for(long int i = 0;i < N;i++)
        cin>>Arr[i];
        Solution ob;
        vector<long long int>ans=ob.twoOddNum(Arr,N);
        for(long long int i=0;i<ans.size();i++)cout<<ans[i]<<" ";
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends