class Solution {
    public boolean isMonotonic(int[] nums) {
        return (isincrease(nums) || isdecrease(nums));
    }

    private boolean isincrease(int[] nums){
        int prev = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] < prev) return false;
            prev = nums[i];
        }
        return true;
    }

    private boolean isdecrease(int[] nums){
        int prev = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] > prev) return false;
            prev = nums[i];
        }
        return true;
    }
}
