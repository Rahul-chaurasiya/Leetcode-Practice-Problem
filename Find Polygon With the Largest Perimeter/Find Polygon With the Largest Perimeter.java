class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = nums[0]+nums[1];
        long max = 0;
        for(int i=2;i<nums.length;i++){
            if(nums[i] < sum) if(sum+nums[i]>max) max = nums[i]+sum;
            sum += nums[i];
        }
        
        return max==0?-1:max;
    }
}
