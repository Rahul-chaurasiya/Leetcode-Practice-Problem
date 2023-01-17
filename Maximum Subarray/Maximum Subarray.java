class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int maxending = nums[0];
        for(int i=1;i<nums.length;i++){
            maxending = Math.max(maxending+nums[i],nums[i]);
            res = Math.max(res,maxending);
        }
        return res;
    }
}
