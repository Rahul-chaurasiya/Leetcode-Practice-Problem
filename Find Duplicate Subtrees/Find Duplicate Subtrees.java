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
    List<TreeNode>l = new LinkedList<>();
    HashMap<String,Integer>hm = new HashMap<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        findduplicate(root);
        return l;
    }

    private String findduplicate(TreeNode root){
        if(root == null) return "n";
        String str = root.val+","+findduplicate(root.left)+findduplicate(root.right);
        int freq = hm.getOrDefault(str,0);
        hm.put(str,++freq);
        if(freq == 2) l.add(root);
        return str;
    }
}
