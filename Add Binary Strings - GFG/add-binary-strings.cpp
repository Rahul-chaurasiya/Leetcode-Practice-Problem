//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++
class Solution{
public:	
	string addBinary(string a, string b)
	{  int x=min(a.length(),b.length());
	int y=max(a.length(),b.length());
	int f=y-x;
	string c="";
	for(int i=0;i<f;i++)
	c+="0";
	if(a.length()>b.length())
	b=c+b;
	else if(b.length()>a.length())
	a=c+a;
	int carry=0;
	string fin="";
	for(int i=a.length()-1;i>=0;i--)
	{
	    if(a[i]=='1' && b[i]=='1' && carry==1)
	    {// cout<<"first"<<endl;
	        fin+="1";
	    }
	    else if(a[i]=='1' && b[i]=='1')
	    { //cout<<"second"<<endl;
	        fin+="0";
	        carry=1;
	    }
	    else if(a[i]=='1' && carry==1)
	    { //cout<<"third"<<endl;
	        fin+="0";
	        carry=1;
	    }
	    else if(b[i]=='1' && carry==1)
	    { ///cout<<"four"<<endl;
	        fin+="0";
	        carry=1;
	    }
	    else if(a[i]=='1' || b[i]=='1')
	    {  //cout<<"five"<<endl;
	        fin+="1";
	    }
	    else if(carry==1)
	    {//cout<<"six"<<endl;
	        fin+="1";
	        carry=0;
	    }
	    else
	    { //cout<<"seven"<<endl;
	    fin+="0";}
	}
	if(carry==1)
	fin+="1";
	reverse(fin.begin(),fin.end());
	while(fin[0]=='0')
	fin=fin.substr(1,fin.size());
	return fin;
	}
};

//{ Driver Code Starts.

int main()
{
	int t; cin >> t;
	while (t--)
	{
		string A, B; cin >> A >> B;
		Solution ob;
		cout << ob.addBinary (A, B);
		cout << "\n";
	}
}

// Contributed By: Pranay Bansal

// } Driver Code Ends