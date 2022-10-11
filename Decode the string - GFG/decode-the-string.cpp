//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    string f(int i,int j,map<int,int>&closing, string &s)
    {
        
        if(i>j) return "";

        string ans;
        if(s[i]=='[')
        {
            return f(i+1,closing[i]-1,closing,s) + f(closing[i]+1,j,closing,s); 
        }
        if(s[i]>='0' && s[i]<='9')   //starting with numeric character
        {
            string temp;
            int count = 0;
            while(i<=j && s[i]>='0' && s[i]<='9')
            {
                temp+=s[i];
                i++;
            }
            count = stoi(temp);
            
            temp = f(i,closing[i]-1,closing,s);   // string to be repeated count times
            while(count>0)
            {
                ans+=temp;
                count--;
            }
            ans+=f(closing[i]+1,j,closing,s);  // remaining string 
            return ans;
        }
        
        while(i<=j && s[i]>='a' && s[i]<='z')  // if string is not a number 
        {
            ans+=s[i];
            i++;
        }
        ans+=f(i,j,closing,s);  // remaining
        return ans;
    }
    
    void mapit(string s, map<int,int>&m)  //to compute indices of the starting and ending of paranthesis
    {
        stack<int> t;
        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='[')
                t.push(i);
            else if(s[i]==']')
            {
                m[t.top()] = i;
                t.pop();
            }
        }
    }
    string decodedString(string s){
        map<int,int> closing;
        mapit(s,closing);
        return f(0,s.size()-1,closing,s);
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        string s;
        cin>>s;
        
        Solution ob;
        cout<<ob.decodedString(s)<<"\n";
    }
    return 0;
}
// } Driver Code Ends