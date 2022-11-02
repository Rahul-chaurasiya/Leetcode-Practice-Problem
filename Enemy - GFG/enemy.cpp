//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution

{

    public:

        int largestArea(int n,int m,int k,vector<vector<int>> &enemy)

        {

            //  code here

            vector<int>row(n,0);

            vector<int>col(m,0);

            for(int i =0;i<enemy.size();i++){

                row[enemy[i][0]-1]=-1;

                col[enemy[i][1]-1]=-1;

            }

            

            

            int rowMax =0;

            int colMax =0;

            int i=0;

            int j =0;

            while(j<n){

                if(row[j]!=-1){

                    j++;

                    rowMax=max(rowMax,j-i);

                }else if(row[j]==-1){

                    j++;

                    i=j;

                }

            }

            

             i=0;

            j =0;

            while(j<m){

                if(col[j]!=-1){

                    j++;

                    colMax=max(colMax,j-i);

                }else if(col[j]==-1){

                    j++;

                    i=j;

                }

            }

            return rowMax*colMax;

        }

};

//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,m;
        cin>>n>>m;
        int k;
        cin>>k;
        vector<vector<int>> e(k,vector<int>(2));
        for(int i=0;i<k;i++)
            cin>>e[i][0]>>e[i][1];
        Solution a;
        cout<<a.largestArea(n,m,k,e)<<endl;
    }
    return 0;
}
// } Driver Code Ends