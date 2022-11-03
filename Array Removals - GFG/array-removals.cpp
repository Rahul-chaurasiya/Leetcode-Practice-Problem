//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
    public:
    int removals(vector<int>& arr, int k){

        //Code here

        // 1 2  5  6  8

        sort(arr.begin() , arr.end());

        

        int maxwindow = 0;

        int i =0 , j=0;

        

        while(j<arr.size()){

            if(arr[j] - arr[i] <=k){

                j++;

            }

            else if(i< j){

                i++;

            }

            maxwindow= max(maxwindow, j-i);

        }

        

        return (arr.size() - maxwindow);

 

    }
};


//{ Driver Code Starts.


int main(){
    int t;
    cin>>t;
    
    while(t--){
        int n,k;
        cin>>n>>k;
        vector<int> arr(n);
        for(int i=0;i<n;i++){
            cin>>arr[i];
        }
        
        Solution ob;
        int ans = ob.removals(arr,k);
        
        cout<<ans<<endl;
    }
}



// } Driver Code Ends