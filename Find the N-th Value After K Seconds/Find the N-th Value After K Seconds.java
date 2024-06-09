class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int ans[] = new int[n];
        Arrays.fill(ans,1);
        for(int i=0;i<k;i++){
            for(int j=1;j<n;j++){
                ans[j] = (ans[j-1] + ans[j]) % 1000000007;
            }
        }
        return ans[n-1];
    }
}
