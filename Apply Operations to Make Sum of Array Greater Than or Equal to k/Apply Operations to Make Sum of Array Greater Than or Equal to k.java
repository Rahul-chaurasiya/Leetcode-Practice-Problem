class Solution {
    public int minOperations(int k) {
        if(k==1) return 0;
        int ans=k;

        for(int i=2;i<=k;i++){
            int val=i-1;
            if(k%i==0) val+=k/i-1;
            else val+=k/i;
            ans=Math.min(ans,val);
        }
        return ans;
    }
}
