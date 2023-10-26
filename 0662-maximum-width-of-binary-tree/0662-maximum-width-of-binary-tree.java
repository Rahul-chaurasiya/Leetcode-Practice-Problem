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
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        Queue<Pair<TreeNode,Integer>> q = new ArrayDeque<>();
        q.offer(new Pair<>(root,0));
        int ans = 0;
        while (q.isEmpty() == false) {
            int size = q.size();
            int min = q.peek().getValue();
            int first = 0,last = 0;
            for (int i = 0; i < size; i++) {
                int currid = q.peek().getValue()-min;
                TreeNode curr = q.peek().getKey();
                q.poll();
                if(i==0) first = currid;
                if(i==size-1) last=currid;
                if (curr.left != null) q.offer(new Pair<>(curr.left,currid*2+1));
                if (curr.right != null) q.offer(new Pair<>(curr.right,currid*2+2));
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
}