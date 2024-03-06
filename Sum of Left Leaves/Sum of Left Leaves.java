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
    int h=0;
    public int sumOfLeftLeaves(TreeNode root) {
        sum(root,false);
        return h;
    }

    private void sum(TreeNode root,boolean isleft){
        if(root == null) return;
        if(root.left == null && root.right == null && isleft) {
            h+=root.val;
        }
        if(root.left != null)sum(root.left,true);
        if(root.right != null)sum(root.right,false);
    }
}
