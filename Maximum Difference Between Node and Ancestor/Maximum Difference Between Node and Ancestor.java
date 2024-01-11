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
    public int maxAncestorDiff(TreeNode root) {
        return findMaxDiff(root, root.val, root.val);
    }

    private int findMaxDiff(TreeNode root, int min, int max) {
        if(root==null) return Math.abs(min-max);

        min = Math.min(min, root.val);
        max = Math.max(max, root.val);

        int left = findMaxDiff(root.left, min, max);
        int right = findMaxDiff(root.right, min, max);

        return Math.max(left, right);
    }
}
