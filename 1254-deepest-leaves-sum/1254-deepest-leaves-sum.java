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
    int sum = 0;
    int mh = 0;
    public int deepestLeavesSum(TreeNode root) {
        func(root,0);
        return sum;
    }

    public void func(TreeNode root,int level){
        if(root == null) return;
        func(root.right,level+1);
        func(root.left,level+1);
        if(root.left == null && root.right == null){
            if(level > mh){
                mh = level;
                sum = root.val;
            }
            else if(level==mh) sum+=root.val;
        }
    }
}