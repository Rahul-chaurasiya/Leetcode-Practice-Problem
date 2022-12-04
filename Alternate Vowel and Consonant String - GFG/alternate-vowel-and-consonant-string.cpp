//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution{
    public:
    string rearrange (string s, int n)
    {
        // your code here
        vector<int> mp1(26),mp2(26); // to store vowels and consonants
        int v = 0,c = 0;
        for(char ch:s){
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){ // if it's vowel
                mp1[ch-'a']++;
                v++;
            }
            else{ // consonant
                mp2[ch-'a']++;
                c++;
            }
        }
        
        if(abs(v-c)>1) return "-1"; // if their diff is greater than one then the given condition can't be prove
        int it1 = 0,it2 = 0,i=0;
        while(it1<mp1.size() && mp1[it1]==0) it1++; // to find first vowel
        while(it2<mp2.size() && mp2[it2]==0) it2++; // to find first consonant
        
        bool f = c>v; // if number of consonant is greater then we will place consonant first else vowel
        if(v==c){
            f = it1>it2; // if both are equal then check which is lexiographically smaller
        }
        
        while((it1<mp1.size() && it2<mp2.size()) && i<n){
            if(f){ 
                s[i] = it2+'a';
                --mp2[it2];
                while(it2<mp2.size() && mp2[it2]==0) it2++;
                f = false; // this will trigger to place vowel next
            }
            else{
                s[i] = it1+'a';
                --mp1[it1];
                while(it1<mp1.size() && mp1[it1]==0) it1++;
                f = true; // this will trigger to place consonant next
            }
            ++i;
        }
        
        if(it1!=mp1.size()) s[i] = it1+'a'; // if one vowel left
        else if(it2!=mp2.size()) s[i] = it2+'a'; // if one consonant left
        
        return s;
    }
};

//{ Driver Code Starts.

int main()
{
	int t; cin >> t;
	while (t--)
	{
		int n; cin >> n;
		string s; cin >> s;
		Solution ob;
		cout << ob.rearrange (s, n) << endl;
	}
}
// Contributed By: Pranay Bansal

// } Driver Code Ends