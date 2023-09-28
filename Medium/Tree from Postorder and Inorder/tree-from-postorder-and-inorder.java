//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class InorderPostorderToTree {
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        InorderPostorderToTree ip = new InorderPostorderToTree();
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int inorder[] = new int[n];
            int postorder[] = new int[n];
            for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
            GfG g = new GfG();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
    }
}

// } Driver Code Ends


/* Tree node structure
class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}*/


class GfG
{
    //Function to return a tree created from postorder and inoreder traversals.
    int post_index;
    Node buildTree(int[] inorder, int[] postorder, int n) {
        post_index = postorder.length - 1;
        return ctree(inorder,postorder,0,inorder.length-1);
    }

    public Node ctree(int in[],int post[],int is, int ie){
        if(is>ie || post_index<0) return null;
        Node root = new Node(post[post_index--]);

        int in_index = 0;
        for(int i=is;i<=ie;i++){
            if(in[i] == root.data){
                in_index = i;
                break;
            }
        }

        root.right = ctree(in,post,in_index+1,ie);
        root.left = ctree(in,post,is,in_index-1);
        return root;
    }
}
