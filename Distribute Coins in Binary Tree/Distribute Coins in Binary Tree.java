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
    int steps = 0;
    public int distributeCoins(TreeNode root) {
        func(root);
        return steps;
    }

    private int func(TreeNode root){
        if(root == null) return 0;
        int l = func(root.left);
        int r = func(root.right);
        steps += Math.abs(l)+Math.abs(r);
        return l+r+root.val-1;
    }
}
