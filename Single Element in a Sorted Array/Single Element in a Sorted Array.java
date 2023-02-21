class Solution {
    public int singleNonDuplicate(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                i++;
                if(i+1 == nums.length) return nums[nums.length-1];
            }
            else return nums[i-1];
        }
        return nums[0];
    }
}
