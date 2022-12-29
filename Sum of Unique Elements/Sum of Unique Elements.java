
class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int result=0;

        if(nums.length == 1 ) return nums[0];

        if(nums.length > 1)
            if(nums[0] != nums[1]) result = nums[0];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i] != nums[i-1] && nums[i] != nums[i+1]) result += nums[i];
        }
        if(nums.length > 1)
            if(nums[nums.length-1] != nums[nums.length-2]) result += nums[nums.length-1];
        return result;
    }
}
