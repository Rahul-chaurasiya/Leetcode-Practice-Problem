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
    
    HashMap<Integer,Integer>hm = new HashMap<>();
    public int[] findMode(TreeNode root) {
        freq(root);
        int highestValue = Collections.max(hm.values());
        int count = 0;
        for (Integer value : hm.values()) {
            if (value == highestValue) count++;
        }

        int arr[] = new int[count];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == highestValue) {
                arr[index] = entry.getKey();
                index++;
            }
        }

        return arr;
    }

    public void freq(TreeNode root){
        if(root == null) return;
        hm.put(root.val,hm.getOrDefault(root.val,0)+1);
        freq(root.left);
        freq(root.right);
    }
}