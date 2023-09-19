class Solution {
    public int findDuplicate(int[] nums) {
        for(int x : nums){
            if(nums[Math.abs(x)-1] > 0) nums[Math.abs(x)-1] = -nums[Math.abs(x)-1];
            else return Math.abs(x);
        }
        return 0;
    }
}