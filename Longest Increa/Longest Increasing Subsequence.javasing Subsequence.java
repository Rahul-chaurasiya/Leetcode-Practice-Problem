
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len=0;
        int max=0;

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i]>nums[j]){
                    if(dp[j]>len) len=dp[j];
                }
            }

            dp[i]=len+1;
            len=0;
            if(dp[i]>max) max=dp[i];
        }
        return max;
    }
}
