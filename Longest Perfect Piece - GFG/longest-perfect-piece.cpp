//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {

  public:

    int longestPerfectPiece(int arr[], int N) {

        // code here

        int i =0;

        int j =0;

        set<int>s;

        int max_element,min_element;

        int ans =1;

        while(j<N){

            s.insert(arr[j]);

            max_element = *(s.rbegin());

            min_element = *(s.begin());

            if(max_element-min_element<=1){

                 ans=max(ans,j-i+1);

                 j++;

            }else{

                while(max_element-min_element>1){

                    s.erase(arr[i]);

                    max_element = *(s.rbegin());

                    min_element = *(s.begin());

                    i++;

                }

            }

 

        }

        return ans;

    }

};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        
        cin>>N;
        int arr[N];
        for(int i=0; i<N; i++)
            cin>>arr[i];

        Solution ob;
        cout << ob.longestPerfectPiece(arr,N) << endl;
    }
    return 0;
}
// } Driver Code Ends