//{ Driver Code Starts
import java.io.*;
import java.util.*;


class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
    
    public static Node buildTree(String str)
    {
        // Corner Case
        if(str.length()==0 || str.charAt(0)=='N')
            return null;
        
        // Creating array of Strings from input 
        // String after spliting by space
        String ip[] = str.split(" ");
        
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        
        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        
        // Starting from the second element
        int i = 1;
        while(queue.size()>0 && i < ip.length)
        {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N"))
            {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N"))
            {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
    public static Node inputTree(BufferedReader br) throws IOException
    {
        return buildTree(br.readLine().trim());
    }
    
    public static void inorder(Node root)
    {
        if (root == null)
           return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            Node node1 = Node.inputTree(br);
            
            
            Node node2 = Node.inputTree(br);
            
            Solution obj = new Solution();
            boolean res = obj.areAnagrams(node1, node2);
            
            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends


/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {

    public static boolean areAnagrams(Node node1, Node node2) {

        // code here

        String a="";

        String b="";

        Queue<Node> queue1=new LinkedList<Node>();

        Queue<Node> queue2=new LinkedList<Node>();

        

        if(node1.data!=node2.data){

            return false;

        }else{

            queue1.add(node1);

            queue1.add(null);

            queue2.add(node2);

            queue2.add(null);

            while(!queue1.isEmpty()&&!queue2.isEmpty()){

               Node curr1=queue1.poll();

               Node curr2=queue2.poll();

               if(curr1==null && curr2==null){

                   if(queue1.isEmpty()&&queue2.isEmpty()){

                       return true;

                   }else{

                    char arr1[]=a.toCharArray();

                    char arr2[]=b.toCharArray();

                    if(arr1.length!=arr2.length)

                        return false;

                    Arrays.sort(arr1);

                    Arrays.sort(arr2);

                    for(int i=0;i<arr1.length;i++){

                        if(arr1[i]!=arr2[i]){

                            return false;

                        }

                    }

 

                   

                   

                   queue1.add(null);

                   queue2.add(null);

                   continue;

                   }

               }

               a+=curr1.data;

               b+=curr2.data;

               if(curr1.left!=null){

                   queue1.add(curr1.left);

               }

               if(curr2.left!=null){

                   queue2.add(curr2.left);

               }

               if(curr1.right!=null){

                   queue1.add(curr1.right);

               }

               if(curr2.right!=null){

                   queue2.add(curr2.right);

               }

               

                

            }

        }

        

        return true;

    }

}