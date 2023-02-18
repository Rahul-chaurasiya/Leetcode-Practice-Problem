class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums[0]<nums[nums.length-1]) return nums[0];
        else{
            for(int i=1;i<nums.length;i++){
                if(nums[i-1]>nums[i]) return nums[i];
            }
        }
        return 0;
    }
}
