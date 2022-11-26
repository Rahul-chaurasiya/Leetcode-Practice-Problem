//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

/* A binary tree node has data, pointer to left
child and a pointer to right child */
class Node
{
public:
    int data;
    Node *left, *right;
    Node(int data)
    {
        this->data = data;
        this->left = this->right = NULL;
    }
};

/* This function is to print the inorder of the tree  */
void inorder(Node *root)
{
    if (root == NULL)
        return;
    inorder(root->left);
    printf("%d ", root->data);
    inorder(root->right);
}



// } Driver Code Ends
//User function Template for C++

/*
class Node
{
public:
    int data;
    Node *left, *right;
    Node(int data)
    {
        this->data = data;
        this->left = this->right = NULL;
    }
};
*/


class Solution{
public:
    // function to construct tree from string
    Node* maketree(string &str, int& i)
    {
        int n = str.size(), m = 0;
        while (i < n && str[i] != '(' && str[i] != ')')
        {
            m = m*10 + str[i] - 48;
            i++;
        }
        Node* head = new Node(m);
        if (i == n || str[i] == ')')
        return head;
        i++;
        if (i == n)
        return head;
        if (str[i] != ')')
        head->left = maketree(str, i);
        i++;
        if (i == n || str[i] == ')')
        return head;
        i++;
        if (str[i] != ')')
        head->right = maketree(str, i);
        i++;
        return head;
    }
    Node *treeFromString(string str){
        // code here
        int i = 0;
        return maketree(str, i);
    }
};

//{ Driver Code Starts.

// Driver Code
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        string str;
        cin >> str;
        Solution obj;
        Node *root = obj.treeFromString(str);
        inorder(root);
        cout << "\n";
    }
    return 0;
}

// } Driver Code Ends