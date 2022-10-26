//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++


class Solution{
public:
    inline bool absent(int y, int z)

    {

        return (y == 0 && z == 0);

    }

    

    inline bool check(int x, int y, int z, int num)

    {

        return (x % 2 == num && y % 2 == num && z % 2 == num);

    }

 

    int findMin(int n, char a[])

    {

        int r = 0,  g = 0, b = 0;

        

        for(int i=0; i<n; i++)

        {

            if(a[i] == 'R')

                r++;

            else if(a[i] == 'G')

                g++;

            else

                b++;

        }

        

        // if only one kind of smurfs are there

        if(absent(g, b) || absent(r, b) || absent(r, g))

            return n;

         

        // if there are even or odd count of all 3 kind of smurfs   

        else if(check(r, g, b, 0) || check(r, g, b, 1))

            return 2;

        

        // rest of the mixed cases

        else

            return 1;

    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        char a[n];
        for(int i = 0;i < n;i++)
            cin>>a[i];
        
        Solution ob;
        cout<<ob.findMin(n, a)<<"\n";
    }
    return 0;
}
// } Driver Code Ends