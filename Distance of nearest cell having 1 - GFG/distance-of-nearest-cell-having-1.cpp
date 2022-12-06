//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution 
{
    public:
    //Function to find distance of nearest 1 in the grid for each cell.
	vector<vector<int>>nearest(vector<vector<int>>grid)
	{
	    // Code here
	    vector<vector<int>> ans = grid;
	    int n = grid.size();
	    int m = grid[0].size();
	    queue<pair<pair<int,int>,int>> q;
	    for(int i=0; i<n; i++){
	        for(int j=0; j<m; j++){
	            if(grid[i][j]==1){
	                grid[i][j]=-1;
	                ans[i][j]=0;
	                q.push({{i,j}, 0});
	            }
	        }
	    }
	    
	    while(q.size()){
	        int i = q.front().first.first;
	        int j = q.front().first.second;
	        int d = q.front().second;
	        q.pop();
	        
	        if(i+1<n && grid[i+1][j]!=-1){
	            q.push({{i+1,j}, d+1});
	            ans[i+1][j]=d+1;
	            grid[i+1][j]=-1;
	        }
	        
	        if(i-1>=0 && grid[i-1][j]!=-1){
	            q.push({{i-1,j}, d+1});
	            ans[i-1][j]=d+1;
	            grid[i-1][j]=-1;
	        }
	        
	        if(j+1<m && grid[i][j+1]!=-1){
	            q.push({{i,j+1}, d+1});
	            ans[i][j+1]=d+1;
	            grid[i][j+1]=-1;
	        }
	        
	        if(j-1>=0 && grid[i][j-1]!=-1){
	            q.push({{i,j-1}, d+1});
	            ans[i][j-1]=d+1;
	            grid[i][j-1]=-1;
	        }
	    }
	    return ans;
}
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n, m;
		cin >> n >> m;
		vector<vector<int>>grid(n, vector<int>(m, -1));
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				cin >> grid[i][j];
			}
		}
		Solution obj;
		vector<vector<int>> ans = obj.nearest(grid);
		for(auto i: ans){
			for(auto j: i){
				cout << j << " ";
			}
			cout << "\n";
		}
	}
	return 0;
}
// } Driver Code Ends