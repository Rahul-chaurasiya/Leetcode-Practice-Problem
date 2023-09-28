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
    int pre_index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return ctree(preorder,inorder,0,preorder.length-1);
    }

    // is : starting index
    // ie : ending index
    public TreeNode ctree(int pre[],int in[],int is, int ie){
        if(is>ie) return null;
        TreeNode root = new TreeNode(pre[pre_index++]);

        int in_index = 0;
        for(int i=is;i<=ie;i++){
            if(in[i] == root.val){
                in_index = i;
                break;
            }
        }

        root.left = ctree(pre,in,is,in_index-1);
        root.right = ctree(pre,in,in_index+1,ie);
        return root;
    }
}