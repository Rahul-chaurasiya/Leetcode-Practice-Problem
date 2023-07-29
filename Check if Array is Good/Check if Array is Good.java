class Solution {
    public boolean isGood(int[] nums) {
        if(nums.length <= 1)return false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(i+1==nums[i])continue;
            else return false;
        }

        if(nums[nums.length-1]==nums[nums.length-2])return true;
        else return false;
    }
}
