class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int ans[] = new int[n+1];
        for(int i=1;i<=n;i++){
            int max = 0;
            int val = 0;
            for(int j=1;j<=Math.min(i,k);j++){
                max = Math.max(max,arr[i-j]);
                val = Math.max(ans[i-j]+max*j,val);
            }
            ans[i] = val;
        }
        return ans[n];
    }
}
