/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int post_index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        post_index = postorder.length - 1;
        return ctree(inorder,postorder,0,inorder.length-1);
    }

    public TreeNode ctree(int in[],int post[],int is, int ie){
        if(is>ie || post_index<0) return null;
        TreeNode root = new TreeNode(post[post_index--]);

        int in_index = 0;
        for(int i=is;i<=ie;i++){
            if(in[i] == root.val){
                in_index = i;
                break;
            }
        }

        root.right = ctree(in,post,in_index+1,ie);
        root.left = ctree(in,post,is,in_index-1);
        return root;
    }

}