//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
	public:
		int characterReplacement(string s, int k){
		    int ans = INT_MIN;
		    
		    for(char ch = 'A'; ch <= 'Z'; ch++) {
		        int limit = k;
		        
		        int i = 0, j = 0;
		        
		        while(j < s.size()) {
		            // if limit reached
		            if(!limit) {
		                while(j<s.size() && s[j]==ch) j++;
		                
		                ans = max(ans, j-i);
		                
		                while(i<s.size() && s[i]==ch) i++;
		                i++, limit++;
		            }
		            
		            // now if the curr char is not select char
		            // we will reduce the k and increase the j
		            // k -> k - 1;
		            if(s[j]!=ch) {
		                j++;
		                limit--;
		            }
		            
		            // else we got the desired char
		            // we dont need to use the limit to change the char
		            else {
		                j++;
		            }
		            
		            // edge case -> when we reached the end
		            if(j==s.size()) {
		                ans = max(ans, j-i);
		            }
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
		string s;
		cin >> s;
		int k;
		cin >> k;
		Solution obj;
		int ans = obj.characterReplacement(s, k);
		cout << ans << "\n";
	}
	return 0;
}
// } Driver Code Ends