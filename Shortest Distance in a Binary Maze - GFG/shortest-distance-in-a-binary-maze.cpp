//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {

  public:

    int shortestPath(vector<vector<int>> &grid, pair<int, int> source,

                     pair<int, int> destination) {

        int dx[]={1,-1,0,0};

        int dy[]={0,0,1,-1};

                   

        int n=grid.size();

        int m=grid[0].size();

        

        vector<vector<int>> dist(n,vector<int>(m,INT_MAX));

                         

        priority_queue< pair<int,pair<int,int>>,vector<pair<int,pair<int,int>>>,greater< pair<int,pair<int,int>>>> pq;

        

        int i=source.first;

        int j=source.second;

        

        if(grid[i][j]==1){

            dist[i][j]=0;

            pq.push({0,{i,j}});

        }

        

        while(!pq.empty()){

            int dis=pq.top().first;

            

            int i1=pq.top().second.first;

            int j1=pq.top().second.second;

            

            pq.pop();

            

            for(int i=0; i<4; i++){

                int i2=i1+dx[i];

                int j2=j1+dy[i];

                

                if(i2>=0 and j2>=0 and i2<n and j2<m and grid[i2][j2]==1 and dist[i1][j1]+1<dist[i2][j2]){

                    dist[i2][j2]=1+dist[i1][j1];

                    pq.push({dist[i2][j2],{i2,j2}});

                }

            }

        }

        

        if(dist[destination.first][destination.second]==INT_MAX){

            return -1;

        }

        return dist[destination.first][destination.second];

    }

};

//{ Driver Code Starts.
int main() {

    int t;
    cin >> t;
    while (t--) {
        int n, m;
        cin >> n >> m;
        vector<vector<int>> grid(n, vector<int>(m));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cin >> grid[i][j];
            }
        }

        pair<int, int> source, destination;
        cin >> source.first >> source.second;
        cin >> destination.first >> destination.second;
        Solution obj;
        cout << obj.shortestPath(grid, source, destination) << endl;
    }
}

// } Driver Code Ends