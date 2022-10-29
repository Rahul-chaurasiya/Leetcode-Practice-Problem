//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    vector<vector<string>> displayContacts(int n, string contact[], string s)
    {
        // code here
        vector<vector<string>> ans;
        vector<string> contact2;
        set<string> st;
        for(int i=0;i<n;i++){
            st.insert(contact[i]);
        }
        for(auto it:st){
            contact2.push_back(it);
        }
        int m = s.length();
        sort(contact2.begin(),contact2.end());
        n = contact2.size();
        for(int i=0;i<m;i++){
            string temp = s.substr(0,i+1);
            vector<string> temp1;
            int count = 0;
            for(int j=0;j<n;j++){
                if(contact2[j].substr(0,i+1) == temp){
                    temp1.push_back(contact2[j]);
                    count++;
                }
            }
            sort(temp1.begin(),temp1.end());
            if(count == 0){
                ans.push_back({"0"});
            }
            else
                ans.push_back(temp1);
        }
        return ans;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        string contact[n], s;
        for(int i = 0;i < n;i++)
            cin>>contact[i];
        cin>>s;
        
        Solution ob;
        vector<vector<string>> ans = ob.displayContacts(n, contact, s);
        for(int i = 0;i < s.size();i++){
            for(auto u: ans[i])
                cout<<u<<" ";
            cout<<"\n";
        }
    }
    return 0;
}
// } Driver Code Ends