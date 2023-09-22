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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>l = new ArrayList<>();
        Queue<TreeNode>q = new LinkedList<>();
        if(root == null) return l;
        q.add(root);
        while(!q.isEmpty()){
            int length = q.size();
            double avg = 0;
            for(int i=0;i<length;i++){
                TreeNode curr = q.poll();
                avg += (double)curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            l.add(avg/length);
        }
        return l;
    }
}