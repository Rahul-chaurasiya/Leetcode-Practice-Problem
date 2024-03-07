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
    int ans = -1;
    public int diameterOfBinaryTree(TreeNode root) {
        function(root);
        return ans-2;
    }

    private int function(TreeNode root){
        if(root == null) return 0;
        int d2 = function(root.left)+1;
        int d3 = function(root.right)+1;
        ans = Math.max(ans,d3+d2);
        return Math.max(d3,d2);
    }
}


===================================================================================================


class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int d[] = new int[1];
        func(root,d);
        return d[0];
    }

    public int func(TreeNode root,int res[]){
        if(root == null) return 0;
        int lh = func(root.left,res);
        int rh = func(root.right,res);
        res[0] = Math.max(res[0],lh+rh);
        return Math.max(lh,rh)+1;
    }
}
