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
    public TreeNode reverseOddLevels(TreeNode root) {
        func(root.left,root.right,1);
        return root;
    }

    public void func(TreeNode root1,TreeNode root2, int height){
        if(root1 == null || root2 == null) return;
        if(height%2 == 1){
            int temp = root1.val;
            root1.val = root2.val;
            root2.val = temp;
        }
        func(root1.left,root2.right,height+1);
        func(root1.right,root2.left,height+1);
    }
}