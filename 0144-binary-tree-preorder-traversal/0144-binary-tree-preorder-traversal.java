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
    List<Integer>list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        maketree(root);
        return list;
    }

    public void maketree(TreeNode root){
        if(root != null){
            list.add(root.val);
            maketree(root.left);
            maketree(root.right);
        }
    }
}