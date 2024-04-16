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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode newnode = new TreeNode(val);
            newnode.left = root;
            return newnode;
        }

        int curr = 1;
        return addnode(root,curr,val,depth);
    }

    private TreeNode addnode(TreeNode root,int curr,int val,int depth){
        if(root == null) return null;
        if(curr == depth-1){
            TreeNode lef = root.left;
            TreeNode righ = root.right;

            root.left = new TreeNode(val);
            root.right = new TreeNode(val);

            root.left.left = lef;
            root.right.right = righ;
            return root;
        }
        root.left = addnode(root.left,curr+1,val,depth);
        root.right = addnode(root.right,curr+1,val,depth);
        return root;
    }
}
