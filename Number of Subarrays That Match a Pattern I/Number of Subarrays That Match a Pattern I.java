class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int n = nums.length-pattern.length-1;
        int ans = 0;
        for(int i=0;i<=n;i++){
            boolean inc = false;
            for(int j=0;j<pattern.length;j++){
                if((nums[i+j+1]<=nums[i+j] && pattern[j]==1 )|| (nums[i+j+1]!=nums[i+j] && pattern[j]==0) || (nums[i+j+1]>=nums[i+j] && pattern[j]==-1)) {
                    inc = true;
                    break;
                }
            }
            if(inc == false) ans++; 
        }
        return ans;
    }
}
