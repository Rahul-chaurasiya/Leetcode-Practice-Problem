//{ Driver Code Starts
import java.util.*;
import java.io.*;
class Node
{
    int data; 
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            int inorder[] = new int[n];
            int preorder[] = new int[n];
            for(int i = 0; i < n; i++)
              inorder[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preorder[i] = sc.nextInt();
              
            Solution ob = new Solution();
            root = ob.buildTree(inorder, preorder, n);
            postOrdrer(root);
            System.out.println();
        }
    }
    
    public static void postOrdrer(Node root)
    {
        if(root == null)
          return;
          
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}
// } Driver Code Ends


class Solution
{
    
    static int pre_index = 0;
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        pre_index = 0; 
        return ctree(preorder,inorder,0,n-1);
    }
    
    public static Node ctree(int pre[],int in[],int is, int ie){
        if(is>ie) return null;
        Node root = new Node(pre[pre_index++]);

        int in_index = 0;
        for(int i=is;i<=ie;i++){
            if(in[i] == root.data){
                in_index = i;
                break;
            }
        }

        root.left = ctree(pre,in,is,in_index-1);
        root.right = ctree(pre,in,in_index+1,ie);
        return root;
    }
}
