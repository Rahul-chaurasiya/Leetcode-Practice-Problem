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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(root.val < val) root.right =  insertIntoBST(root.right,val);
        else if(root.val > val) root.left = insertIntoBST(root.left,val);
        return root;
    }
}


==================================================================================================


class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp = new TreeNode(val);
        TreeNode curr = root;
        TreeNode parent = null;
        while(curr != null){
            parent = curr;
            if(curr.val > val) curr = curr.left;
            else if(curr.val < val) curr = curr.right;
            else return root;
        }
        if(parent == null) return temp;
        if(parent.val > val) parent.left = temp;
        else if(parent.val < val) parent.right = temp;
        return root;
    }
}
