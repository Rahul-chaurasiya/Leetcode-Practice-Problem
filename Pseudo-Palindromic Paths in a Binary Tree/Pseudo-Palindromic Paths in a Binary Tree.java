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
    public int pseudoPalindromicPaths (TreeNode root) {
        int arr[] = new int[10];
        return dfs(root,arr);
    }

    private int dfs(TreeNode root,int[] arr){
        if(root == null) return 0;
        arr[root.val]++;
        if(root.right == null && root.left == null){
            int count = countodd(arr);
            arr[root.val]--;
            return count <= 1?1:0;
        }

        int leftcount = dfs(root.left,arr);
        int rightcount = dfs(root.right,arr);

        arr[root.val]--;
        return leftcount+rightcount;
    }

    private int countodd(int []arr){
        int count = 0;
        for(int x : arr){
            if(x%2 != 0) count++;
        }
        return count;
    }
}
