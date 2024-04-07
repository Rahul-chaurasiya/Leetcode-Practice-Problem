class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec = 1;
        int ans = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                inc++;
                dec=1;
            }else if(nums[i]<nums[i-1]){
                dec++;
                inc=1;
            }else{
                dec=1;
                inc=1;
            }
            ans = Math.max(Math.max(dec,inc),ans);
        }
        return ans;
    }
}
