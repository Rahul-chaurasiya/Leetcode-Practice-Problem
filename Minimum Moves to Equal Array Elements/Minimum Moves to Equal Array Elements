class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            min = Math.min(min, n);
        }

        int ans = 0;
        for (int n : nums) {
            ans += (n - min);
        }

        return ans;
    }
}
