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
    String ans = "";
    public String smallestFromLeaf(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        smallstr(root,sb);
        return ans;
    }

    private void smallstr(TreeNode root, StringBuilder sb){
        if(root == null) return;
        sb.insert(0,(char)('a'+root.val));
        if(root.left == null && root.right == null){
            if(ans == "" || ans.compareTo(sb.toString())>0) ans = sb.toString();
        }
        smallstr(root.left,sb);
        smallstr(root.right,sb);
        sb.deleteCharAt(0);
    }
}
