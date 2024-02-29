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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode>q = new ArrayDeque<>();
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()){
            int qsize = q.size();
            TreeNode prvnode = null;
            for(int i=0;i<qsize;i++){
                TreeNode curr = q.poll();
                if(level%2==0){
                    if(curr.val%2 == 0) return false;
                    if(prvnode != null && prvnode.val >= curr.val) return false;
                }else{
                    if(curr.val%2>0) return false;
                    if(prvnode != null && prvnode.val <= curr.val) return false;
                }
                prvnode = curr;
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            level++;
        }
        return true;
    }
}
